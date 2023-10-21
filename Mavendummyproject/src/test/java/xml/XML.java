package xml;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import utilities.SeleniumUtil;

public class XML extends SeleniumUtil {
	@Parameters({"browser"})
	@Test
	public void testCaseOne(String browser) {
		System.out.println("browser "+browser);
				
	}
	@Parameters({"username","password"})
	@Test
	public void testCasetwo(String username,String password) {
		System.out.println("username "+username);
		System.out.println("password"+password);
	}
	@Parameters({"browser","username","password"})
    @Test	
    public void vitiger(String browser,String username,String password ) {
		setUp(browser,"https://demo.vtiger.com/vtigercrm/index.php");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('username')[0].value='admin'");
		js.executeScript("document.getElementsByName('password')[0].value='admin'");
		js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
}
}
