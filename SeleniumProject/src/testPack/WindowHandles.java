package testPack;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	
	WebDriver driver = null;

	@Test
		public void launchingDriver() throws InterruptedException, IOException{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    //To maximize browser
		    driver.manage().window().maximize();
		    //Implicit Wait
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			Set<String> allwindow=driver.getWindowHandles();
			for(String handle: allwindow)
			{
				System.out.println("Window handle ->"+handle);
			}
	
		}

	}


