package testPack;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderTable {
	 public static void main(String[] args) {
	        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	        String baseUrl = "http://demo.guru99.com/test/upload/";
	        WebDriver driver = new FirefoxDriver();
	        driver.get(baseUrl);
	}
	 
	        
	

}
