package testPack;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngAnnotations {
	@BeforeClass
	public void openApp() {
		Reporter.log("@BeforeClass", true);
	}

	@AfterClass
	public void closeApp() {
		Reporter.log("@AfterClass", true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("@BeforeMethod", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("@AfterMethod", true);
	}

	@BeforeTest
	public void testit() {
		Reporter.log("@BeforeTest", true);
	}

	@AfterTest
	public void testaf() {
		Reporter.log("@AfterTest", true);
	}

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("@BeforeSuite", true);

	}

	@AfterSuite
	public void aftersuite() {
		Reporter.log("AfterSuite", true);
	}

	@Test(priority = 2, invocationCount = 2)
	public void editUser() {
		Reporter.log("Test1", true);
	}

	@Test(enabled = false)
	public void register() {
		Reporter.log("Test2", true);
	}

	@Test
	public void deleteUser() {
		Reporter.log("Test3", true);
	}
}