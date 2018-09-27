package testPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // navigates to the Browser
		driver.get("http://toolsqa.com/iframe-practice-page/");
		// navigates to the page consisting an iframe

		driver.manage().window().maximize();
		List<WebElement> ss = driver.findElements(By.tagName("iframe"));

		int ll = ss.size();
		System.out.println(ss);
		System.out.println(ll);
		driver.switchTo().frame(1);
		String dd = driver.findElement(By.xpath("//*[text()='Home']")).getText();
		System.out.println(dd);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(dd);
		Thread.sleep(3000);

	}

}
