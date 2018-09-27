package testPacka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

import utilitiy.ExcelUtils;

public class DataProviderWithExcel_001 {

	WebDriver driver=null;

	@BeforeMethod

	public void beforeMethod() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");

	}

	@Test(dataProvider = "Authentication")

	public void Registration_data(String sUserName, String sPassword) throws Exception {

		driver.findElement(By.xpath(".//*[@id='account']/a")).click();

		driver.findElement(By.id("log")).sendKeys(sUserName);

		System.out.println(sUserName);

		driver.findElement(By.id("pwd")).sendKeys(sPassword);

		System.out.println(sPassword);

		driver.findElement(By.id("login")).click();

		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		driver.findElement(By.xpath(".//*[@id='account_logout']")).click();

	}

	@DataProvider

	public Object[][] Authentication() throws Exception {

Object[][] testObjArray = ExcelUtils.getTableArray("C://Users//v.bamdeo.sharma//eclipse-workspace//SeleniumProject//testdata//testData//TestData.xlsx",
				"Sheet1");

		return (testObjArray);

	}

	@AfterMethod

	public void afterMethod() {

		driver.close();

	}

}