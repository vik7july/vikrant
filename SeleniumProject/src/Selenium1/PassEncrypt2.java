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
public class PassEncrypt2 {
	public void launchingDriver() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// To maximize browser
		driver.manage().window().maximize();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement usnm = driver.findElement(By.cssSelector("input#email"));
		WebElement pwd = driver.findElement(By.cssSelector("input#pass"));
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		String encodedBytes = "UHVqYUBjdXRpZXBpZQ==";
		usnm.sendKeys("vik7july@gmail.com");
		Thread.sleep(3000);
		pwd.sendKeys(decodeStr(encodedBytes));
		Thread.sleep(3000);
		login.click();
	}

	public static String decodeStr(String encodedstr) {
		byte[] decodedBytes = Base64.decodeBase64(encodedstr);
		return new String(decodedBytes);

	}
	public static String encodeStr(String txt) {
		byte[] encodebyte = Base64.encodeBase64(txt.getBytes());
		return new String(encodebyte);
//String tt = "pass";
//String gg = encodeStr(tt);
	}
}