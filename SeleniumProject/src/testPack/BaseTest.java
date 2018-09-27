package testPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BaseTest {

	WebDriver driver = null;
  
   @BeforeTest
    public void launchingDriver() throws InterruptedException, IOException{
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
    driver = new FirefoxDriver();
    //To maximize browser
    driver.manage().window().maximize();
    //Implicit Wait
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.toolsqa.com");
	//driver.get("http://www.google.com");
	/*Thread.sleep(5000);
	System.out.println(driver.getTitle());
	WebElement TextSearch = driver.findElement(By.xpath("//input[@title='Search']"));
	TextSearch.sendKeys("football");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div[2]/div[2]/div[1]/div/ul/li[text()='football news')]")).click();
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());*/
	//System.out.println(driver.getPageSource());
	//System.out.println(driver.getWindowHandles());
	//driver.close();
   }
   
   @AfterSuite
   public void TeardownTest()
   {
	   driver.quit();
   }
   
}
