package excel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtil;

public class Vitiger extends SeleniumUtil {
	 String AppURL;
	 String UserName;
	 String Password;
	 String Expectedtitle;
	 String Actualtitle;
	 
	 static int row=6;
	
	@BeforeTest
	public void getData() {
		
		AppURL=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 1, 0);
		UserName=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 1, 1);
		Password=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 1, 2);
		Expectedtitle=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",1,3);
		
	}
  @Test
  public void login() {
	  setUp("chrome",AppURL);
	  typeInput(driver.findElement(By.id("username")),UserName);
	  typeInput(driver.findElement(By.id("password")),Password);
	  //clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
	  Actualtitle=getCurrentPageTitle("vtiger");
	 Assert.assertEquals(Actualtitle,"vtiger");
  }
  @AfterMethod
  public void cleanUp() {
	  ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx", "TC", 1, 4, Actualtitle);
	  if(Actualtitle.equals("vitiger")) {
		  ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC", 1,5,"Passed");
	  }else {
		  ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",1,5,"Failed");
	  }
	  cleanUp();
	  ++row;
  }
}
