package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
WebDriver driver=null;
	@BeforeTest
    public void launchingDriver() throws InterruptedException, IOException{
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
    driver = new FirefoxDriver();
    //To maximize browser
    driver.manage().window().maximize();
    //Implicit Wait
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.toolsqa.com");
	}
	 @AfterTest
	   public void TeardownTest()
	   {
		   driver.quit();
	   }
}
