package Selenium1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScript {
	
	WebDriver driver = null;
	  
	   @Test
	    public void launchingDriver() throws InterruptedException, IOException{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    //To maximize browser
	    driver.manage().window().maximize();
	    //Implicit Wait
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("http://www.toolsqa.com");
		driver.get("http://www.google.com");
		WebElement testing = driver.findElement(By.xpath("//*[@id='hplogo']"));
        //To get background color
		String ot = testing.getCssValue("color");
		System.out.println(testing.getCssValue("background-color"));
		System.out.println(testing.getCssValue("color"));
		String hex = Color.fromString(ot).asHex();
		System.out.println(hex);
		// To highlight WebElement
		WebElement ele = driver.findElement(By.linkText("Store"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		
		js.executeScript("arguments[0].style.color='green'", ele);
		
		
		}
}
