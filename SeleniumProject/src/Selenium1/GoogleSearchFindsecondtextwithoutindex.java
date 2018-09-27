	package Selenium1;
	
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

	public class GoogleSearchFindsecondtextwithoutindex {
		
	@Test 
	public void googleSearch() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.makemytrip.com/flights");
	WebElement textbox=driver.findElement(By.id("hp-widget__sfrom"));
	textbox.clear();
	textbox.sendKeys("Bang");
	Thread.sleep(2000);
	List<WebElement> allOptions = driver.findElements(By.xpath("//div[contains(@class,'autoCompleteItem')]"));
	int count=allOptions.size();
	System.out.println("No. of autosuggestions"+count);
	System.out.println("List of autosuggstions");
	System.out.println("List of autosuggstions");
	for(int i=0;i<count;i++)
	{
	String text=allOptions.get(i).getText();
	System.out.println(text);
	}
	textbox.sendKeys(Keys.ARROW_DOWN);
	textbox.sendKeys(Keys.ARROW_DOWN);
	textbox.sendKeys(Keys.ENTER);
	}
	}
	