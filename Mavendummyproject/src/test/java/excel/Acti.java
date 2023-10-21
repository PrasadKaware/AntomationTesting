package excel;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtil;

public class Acti extends SeleniumUtil {
	String AppURL;
	String UserName;
	String Password;
	String Expectedtitle;
	String Actualtitle;
	static int row=6;
	@BeforeMethod
	public void getData() {
		AppURL=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",4,0 );
		UserName=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",4, 1);
		Password=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 4, 2);
		Expectedtitle=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 4, 3);
		
	}
  @Test
  public void f() {
	  setUp("chrome",AppURL);
	  typeInput(driver.findElement(By.id("username")),UserName);
	  try {
	  typeInput(driver.findElement(By.name("pwd")),Password);
	  }
	  catch(Throwable e) {
		  e.printStackTrace();
	  }
	  clickOnElement(driver.findElement(By.id("loginButton")));
	  Actualtitle=getCurrentPageTitle("actiTIME - Login");
  }
  @AfterMethod
  public void update() {
	  ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 4, 4, Actualtitle);
	  if(Actualtitle.equals("actiTIME - Login")) {
		  ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 4, 5, "Passed");
	  }else {
		  ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx", "TC", 4, 5, "Failed");
	  }
	  update();
	  ++row;
  }
}
