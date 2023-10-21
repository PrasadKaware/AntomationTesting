package script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Actitime extends SeleniumUtil{
	@Test
	public void Login() {
		WebDriver driver = setUp("chrome","https://demo.actitime.com/login.do");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName('textField')[0].value='admin'");
		js.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		js.executeScript("document.getElementById('loginButton').click();");
		js.executeScript("window.scrollBy(0,2000)");
		
	}

}
