package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestSteps {

	public static WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_homepage() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
	}
	@When("^User Navigate to LogIn Page$")
	public void user_navigate_to_login_page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
    @When("^User Enters Username and Password$")
    public void user_enters_username_and_pass() throws Throwable {
    	driver.findElement(By.id("log")).sendKeys("testuser_1"); 	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	    driver.findElement(By.id("login")).click();
    }
    @Then("^Message displayed Login Successfully$")
    public void message_displayed_login_success() throws Throwable{
    	System.out.println("Login Success");
    }
    @When("^User LogOut from the Application$")
    public void user_logout_from_application() throws Throwable{
    	driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
    }
    @Then("^Message displayed LogOut Successfully$")
    public void logout_success() throws Throwable{
    	System.out.println("Logout Success");
    }
}
