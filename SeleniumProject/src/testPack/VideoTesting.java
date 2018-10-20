package testPack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Selenium1.GmailLoginPage;

public class VideoTesting {
	WebDriver driver;
@Test
	public void videoTest() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	    driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/watch?v=z65VETxBaEM");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//Click on play button
		jse.executeScript("player.playVideo();");
		Thread.sleep(2000);
		//Pause
		jse.executeScript("jwplayer().pause()");
		Thread.sleep(2000);
		//Play
		jse.executeScript("jwplayer().play();");
		Thread.sleep(2000);
		// Set Volume
		Thread.sleep(2000);
		jse.executeScript("jwplayer().setVolume(50);");
		Thread.sleep(2000);
		//Mute Player
		jse.executeScript("jwplayer().setMute(true);");
		Thread.sleep(2000);
		//UnMute Player
		jse.executeScript("jwplayer().setMute(false);");
		Thread.sleep(2000);
		//Stop the player
		jse.executeScript("jwplayer().setVolume(50);");
		Thread.sleep(2000);
		jse.executeScript("jwplayer().stop()");
		Thread.sleep(5000);
		jse.executeScript("jwplayer().play();");
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	

}
