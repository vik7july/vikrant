package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SortusingCollectionList {

	static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    //To maximize browser
	    driver.manage().window().maximize();
	    //Implicit Wait
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com");
		List<WebElement> Sort = driver.findElements(By.xpath(".//*[@class='num ng-binding']"));
        System.out.println(Sort);
	}

}
