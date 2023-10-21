package xml;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Actitime extends SeleniumUtil {

@Parameters({"browser","username","password"})
@Test
public void login(String browser,String username,String password) {
	setUp(browser,"https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	clickOnElement(driver.findElement(By.id("loginButton")));
	
}
}
