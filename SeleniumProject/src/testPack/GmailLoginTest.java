package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Selenium1.GmailLoginPage;

@Test
public class GmailLoginTest {
	WebDriver driver;
	public void gmaillogin() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 
		driver.get("https://www.gmail.com/");	
		Thread.sleep(3000);
		GmailLoginPage l = new GmailLoginPage(driver);
		l.createAcc("INS","VIKRANT");
		Reporter.log("Success");
		
		driver.close();
	}
}
