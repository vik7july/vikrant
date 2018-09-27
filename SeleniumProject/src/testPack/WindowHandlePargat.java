package testPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlePargat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();

		d.get("https://www.makemytrip.com/");
		String mainwindow = d.getWindowHandle();

		System.out.println(mainwindow);
		String s = d.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).getAttribute("value");
		System.out.println(s);
		d.findElement(By.xpath("//*[@id='hp-banner']/div[1]/div/div[6]/div/a/img")).click();

		Set<String> set1 = d.getWindowHandles();

		Iterator<String> itr = set1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			d.switchTo().window(itr.next());
		}

		/*String mainwindow1 = itr.next();
		String secondwindow = itr.next(); */           

		//d.switchTo().window(secondwindow);

		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    d.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).sendKeys(s);

		
		d.switchTo().window(mainwindow);

		//d.findElement(By.xpath("//*[@id='hp-banner']/div[1]/div/div[6]/div/a/img")).click();
	    d.close();

	}

}
