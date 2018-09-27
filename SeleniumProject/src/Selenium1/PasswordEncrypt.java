package Selenium1;

import java.io.IOException;
import java.sql.Driver;
//import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class PasswordEncrypt {
	public void launchingDriver() throws InterruptedException, IOException {
		
		  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver(); //To maximize browser
		  driver.manage().window().maximize(); //Implicit Wait
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/"); WebElement usnm =
		  driver.findElement(By.cssSelector("input#email")); WebElement pwd =
		  driver.findElement(By.cssSelector("input.inputtext")); WebElement login =
		  driver.findElement(By.xpath("//input[@type='submit']"));
		 
		byte[] encodedBytes = Base64.encodeBase64("Puja".getBytes());
		System.out.println("encodedBytes " + new String(encodedBytes));

		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
		System.out.println("decodedBytes " + new String(decodedBytes));

		// pwd.sendKeys(new String(encodedBytes));
	}
}
