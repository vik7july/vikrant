package testPack;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draganddrop {

    WebDriver driver;
    @Test
    public void ByPixel() {
    	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");					
        
      		/*//Element which needs to drag.    		
              	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
               
               //Element on which need to drop.		
               WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
               		
               //Using Action class for drag and drop.		
               Actions act=new Actions(driver);					

      	//Dragged and dropped.		
               act.dragAndDrop(From, To).build().perform();*/
               WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));					
               
               //Using Action class for drag and drop.		
               Actions act=new Actions(driver);					
             
               //Drag and Drop by Pixel.		
               act.dragAndDropBy(From,135, 40).build().perform();
    }
}
