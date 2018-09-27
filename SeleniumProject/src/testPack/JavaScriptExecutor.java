package testPack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		WebDriver driver = null;
		// Highlight Element background
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// use executeScript() method and pass the arguments
		// Here i pass values based on css style. Yellow background color with solid red
		// color border.
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				"element xpath pass");
	}

}
