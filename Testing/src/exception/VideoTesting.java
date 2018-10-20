/*
 * package exception;
 * 
 * public class VideoTesting { static String chromeDriverPath =
 * System.getProperty("user.dir") + "/libs/chromedriver.exe";
 * 
 * public static void main(String[] args) throws InterruptedException{
 * 
 * System.setProperty("webdriver.chrome.driver",chromeDriverPath); //WebDriver
 * driver = new FirefoxDriver();
 * 
 * //driver.get(
 * "https://developer.jwplayer.com/jw-player/demos/basic/add-download-button/");
 * //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 * 
 * JavascriptExecutor jse = (JavascriptExecutor) driver; //Click on play button
 * jse.executeScript("jwplayer().play();"); Thread.sleep(2000); //Pause
 * jse.executeScript("jwplayer().pause()"); Thread.sleep(2000); //Play
 * jse.executeScript("jwplayer().play();"); Thread.sleep(2000); // Set Volume
 * Thread.sleep(2000); jse.executeScript("jwplayer().setVolume(50);");
 * Thread.sleep(2000); //Mute Player
 * jse.executeScript("jwplayer().setMute(true);"); Thread.sleep(2000); //UnMute
 * Player jse.executeScript("jwplayer().setMute(false);"); Thread.sleep(2000);
 * //Stop the player jse.executeScript("jwplayer().setVolume(50);");
 * Thread.sleep(2000); jse.executeScript("jwplayer().stop()");
 * Thread.sleep(5000); jse.executeScript("jwplayer().play();");
 * Thread.sleep(5000);
 * 
 * driver.quit(); }
 * 
 * 
 * 
 * }
 */