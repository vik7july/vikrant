package Selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//Move Browser
		Point p = new Point(200, 300);
		//driver.manage().window().setPosition(p);
		//Maximize
		//driver.manage().window().maximize();
		//ReSize Browser
		Dimension dd = new Dimension(100, 100);
		//driver.manage().window().setSize(dd);
		driver.get("https://www.google.com");
		// open page without get method
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
