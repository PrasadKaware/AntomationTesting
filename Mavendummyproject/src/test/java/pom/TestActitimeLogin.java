package pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestActitimeLogin extends SeleniumUtility {
	Actitime getActitime;
	ActitimeHomepage getActitimeHomepage;
	ActitimeAdd getActitimeAdd;
	WebDriver driver;
	@BeforeTest
	public void PreConditon() {
		driver=setUp("chrome","https://demo.actitime.com/login.do");
		getActitime=new Actitime(driver);
		getActitimeHomepage=new ActitimeHomepage(driver);
		getActitimeAdd=new ActitimeAdd(driver);
	}
	@Test
	public void testlogin() {
		getActitime.getUsername("Admin");
		getActitime.getPassword("manager");
		getActitime.clickLogin();
		getActitimeHomepage.clickOnReport("Tasks");
		getActitimeAdd.getClick();
		getActitimeAdd.Creat();
		String Actualtitle=driver.getTitle();
		System.out.println(" actutal title "+Actualtitle);
	}

}
