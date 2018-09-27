package testPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.text.ParseException;

public class WebTables {

	public static void main(String[] args) throws ParseException {
		WebDriver wd;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		wd = new FirefoxDriver();
		wd.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
		// No.of Columns in a table
		List<WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		// No of rows
		List<WebElement> row = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		int nocolumn = col.size();
		int norow = row.size();
		System.out.println(nocolumn);
		System.out.println(norow);

		// To find 3rd row of the table
		List<WebElement> thirdrow = wd.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td"));
		for (WebElement third : thirdrow) {
			System.out.println(third.getText());
		}

		// To find Particular Value
		WebElement threetwo = wd.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[3]"));
		try {
			String twothree = threetwo.getText();
			// int twoval =Integer.parseInt(twothree);
			double twoval = Double.parseDouble(twothree);
			System.out.println(twoval);
		} catch (NumberFormatException e) {

		}
		double sum = 0;
		try {
			// To find Sum of all value for particular column
			for (int i = 2; i < row.size(); i++) {

				WebElement Sumval = wd
						.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[3]"));
				// String tt =Sumval.get(i).getText();
				sum = sum + Double.parseDouble(Sumval.getText());

			}
			System.out.println(sum);
		} catch (NumberFormatException e) {

		}
		wd.close();
	}
}
