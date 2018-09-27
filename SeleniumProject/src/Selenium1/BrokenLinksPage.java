/*package Selenium1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class BrokenLinksPage {
	
	  public void brokenlinkVerify() throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.makemytrip.com/flights");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("Total links are "+links.size()); 
		 //used for loop to
		 for(int i=0; i<links.size(); i++) {
		 WebElement element = links.get(i);
		 //By using "href" attribute, we could get the url of the requried link
		 String url=element.getAttribute("href");
		 Thread.sleep(2000);
		// URL link = new URL(url);
		 // Create a connection using URL object (i.e., link)
		 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		 //Set the timeout for 2 seconds
		 httpConn.setConnectTimeout(2000);
		 //connect using connect method
		 httpConn.connect();
		 //use getResponseCode() to get the response code. 
		 if(httpConn.getResponseCode()== 200) { 
		 System.out.println(url+" - "+httpConn.getResponseMessage());
		 }
		 if(httpConn.getResponseCode()== 404) {
		 System.out.println(url+" - "+httpConn.getResponseMessage());
		 }
		 }
		 driver.close();
		 
	  

		 
		
	


*/