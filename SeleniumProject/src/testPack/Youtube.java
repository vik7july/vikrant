/*package testPack;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.firefox.FirefoxDriver;
import testPack.FlashObjectWebDriver;
public class Youtube {
 public static void main(String[] args) throws InterruptedException, JavascriptException {
	 System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
 FirefoxDriver driver = new FirefoxDriver();
 
FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "movie_player");
 
driver.get("https://www.youtube.com/watch?v=z65VETxBaEM");
 Thread.sleep(2000);
 
 // let the video load
 while (Integer.parseInt(flashApp.callFlashObject("getPlayerState")) == 3){
 Thread.sleep(1000L);
 }
 
 // Play the video for 10 seconds
 //Thread.sleep(5000);
 flashApp.callFlashObject("pauseVideo");
 //Thread.sleep(5000);
 flashApp.callFlashObject("playVideo");
 //Thread.sleep(5000);
 flashApp.callFlashObject("seekTo","140","true");
 //Thread.sleep(5000);
 flashApp.callFlashObject("mute");
 //Thread.sleep(5000);
 flashApp.callFlashObject("setVolume","50");
 //Thread.sleep(5000);
 
}
 
}
*/