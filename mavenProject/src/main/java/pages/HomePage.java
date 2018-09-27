package pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.Log;

@Listeners(listener_Demo.ListenerTest.class)

public class HomePage {
//Test to pass as to verify listeners.		
	@Test
	public void Login() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Implicit Wait
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr34926");
		driver.findElement(By.name("password")).sendKeys("amUpenu");
		driver.findElement(By.id("")).click();
		Log.info("dfw");
	}

//Forcefully pass this test as verify listener.		
	@Test(priority=1)
	public void TestToPass() {

		DOMConfigurator.configure("log4j.xml");

		Log.startTestCase("Selenium_Test_001");
		System.out.println("This method to test ");
		Log.info("Vikrant");
		Assert.assertTrue(true);
	}
}