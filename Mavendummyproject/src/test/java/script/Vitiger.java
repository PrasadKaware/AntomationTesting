package script;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Vitiger extends SeleniumUtil {
	@Test
	public void Login() {
		setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('username')[0].value='admin'");
		js.executeScript("document.getElementsByName('password')[0].value='admin'");
		js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
		
	}

}
