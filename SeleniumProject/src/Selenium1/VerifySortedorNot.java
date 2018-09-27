package Selenium1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifySortedorNot {
	WebDriver driver = null;

	@Test
	public void launchingDriver() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		// To maximize browser
		driver.manage().window().maximize();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(
				"https://flights.makemytrip.com/makemytrip/search/O/O/E/1/0/0/S/V0/BLR_BOM_15-09-2018?contains=false&remove=");
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='num ng-binding']"));
		System.out.println(prices);
		ArrayList<String> jj = new ArrayList<String>();
		for (WebElement wb : prices) {
			String gg = wb.getText();

			jj.add(gg);

		}
		System.out.println(jj);
		ArrayList<String> hh = new ArrayList<String>();

		jj = hh;
		Collections.sort(hh);
		if (jj.equals(hh)) {
			System.out.println("Prices are sorted");
		}

	}
}
