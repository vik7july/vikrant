package testPack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseParentWindowAndMovetoLastWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		WebElement copy = driver.findElement(By.xpath("//*[@id='content']/h2[1]"));
		String cc = copy.getText();
		System.out.println(cc);
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1"));

		for (int i = 0; i < 1; i++) {
			clickElement.click();
			Thread.sleep(5000);
		}

		Set<String> allWindowHandles = driver.getWindowHandles();
		String lastWindowHandle = "";
		for (String handle : allWindowHandles) {
			System.out.println("Switching to window - > " + handle);
			System.out.println("Navigating to google.com");
			driver.switchTo().window(handle); // Switch to the desired window first and then execute commands using
			driver.manage().window().maximize();
			// *[@id='trigger-overlay']
			driver.findElement(By.xpath("//*[@id='trigger-overlay']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(cc);
			Thread.sleep(3000);
			// driver.get("http://google.com");
			lastWindowHandle = handle;
		}

		// Switch to the parent window
		driver.switchTo().window(parentWindowHandle);
		// close the parent window
		driver.close();
		// at this point there is no focused window, we have to explicitly switch back
		// to some window.
		driver.switchTo().window(lastWindowHandle);
		driver.get("http://toolsqa.wpengine.com");
	}
}
