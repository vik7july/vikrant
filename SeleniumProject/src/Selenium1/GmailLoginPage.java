package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage {
	
	@FindBy(id="firstName")
	private WebElement firstnam;
	@FindBy(id="lastName")
	private WebElement lastnam;
	@FindBy(id="username")
	private WebElement usernam;
	@FindBy(name="Passwd")
	private WebElement pass;
	@FindBy(name="ConfirmPasswd")
	private WebElement confirmpass;
	@FindBy(xpath="//content[text()='Next']")
	private WebElement nextBtn;
	
	@FindBy(xpath="//span[text()='Create account']")
	private WebElement createaccount;
	
	public GmailLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void createAcc(String fn, String ln) throws InterruptedException {
		createaccount.click();
		Thread.sleep(3000);
		firstnam.sendKeys(fn);
		lastnam.sendKeys(ln);
   }
 }
	//Testing 


