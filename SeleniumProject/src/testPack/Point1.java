package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Point1 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    //To maximize browser
	    driver.manage().window().maximize();
	    //Implicit Wait
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement text=driver.findElement(By.linkText("Gmail"));
        //Point p = new Point(text);
		Point p = text.getLocation();
		System.out.println(p);
		int numX = p.getX();
		System.out.println(numX);
		int numY = p.getY();
		System.out.println(numY);
		Actions action = new Actions(driver);

		action.moveToElement(text, numX, numY).click().build().perform();
    
	}

}
