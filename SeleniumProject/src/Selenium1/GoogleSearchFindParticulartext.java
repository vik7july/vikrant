package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class GoogleSearchFindParticulartext {
	
@Test 
public void googleSearch() {
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.google.com");
WebElement dd=driver.findElement(By.xpath("//input[@title='Search']"));
dd.sendKeys("selenium");
dd.sendKeys(Keys.ARROW_DOWN);
dd.sendKeys(Keys.ARROW_DOWN);
dd.sendKeys(Keys.ENTER);
String xp="//span[contains(text(),'selenium')]";
List<WebElement> allAut = driver.findElements(By.xpath(xp));
int count=allAut.size();
System.out.println("No of autosuggesions:"+count);
System.out.println("List of Autosuggestions..");
int position=0;
for(int i=0;i<count;i++)
{
WebElement aut = allAut.get(i);
String text=aut.getText();
System.out.println(text);
if(text.equals("selenium webdriver"))
{
position=i;
}
}
allAut.get(position).click();
System.out.println(position);
}
}