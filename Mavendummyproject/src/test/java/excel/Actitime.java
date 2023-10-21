package excel;

import utilities.ExcelUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Actitime extends SeleniumUtil {
	String AppUrl;
	String UserName;
	String Password;
	String Expectedtitle;
	String ActualTitle;
	String Result;
	static int row = 6;

@BeforeMethod
public void getData() {
	AppUrl=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",3,0);
	UserName=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",3,1 );
	Password=ExcelUtility.getCellValue(".\\src\\main\\resources\\test\\AppTest.xlsx","TC",3,2);
	Expectedtitle=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",3,3);
	}
	@Test
	public void filldata() {
		setUp("chrome",AppUrl);
		typeInput(driver.findElement(By.id("username")),UserName);
		typeInput(driver.findElement(By.name("pwd")),Password);
		
		clickOnElement(driver.findElement(By.id("loginButton")));
		ActualTitle=getCurrentPageTitle("actiTIME - Enter Time-Track");
		Assert.assertEquals(ActualTitle,"actiTIME - Enter Time-Track");
	}
	@AfterTest
	public void update() {
		
		ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx", "TC", 3,4, ActualTitle);
		if(ActualTitle.equals("actiTIME - Enter Time-Track")) {
			ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 3,5,"passed");
		}else {
			ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 3,5,"fail");
		}
	 update();
	 ++row;
	
		}

	
}


