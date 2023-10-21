package excel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtil;

public class OrangeHrm extends SeleniumUtil {
	String Appurl;
	String Username;
	String Password;
	String Expectedtitle;
	String Actualtitle;
	static int row=6;
	@BeforeMethod
	public void getData() {
		Appurl=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx", "TC", 5, 0);
		Username=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",5, 1);
		Password=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",5, 2);
		//Expectedtitle=ExcelUtility.getCellValue("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",5, 3);
		
	}
	@Test
	public void Login() {
		setUp("chrome",Appurl);
		typeInput(driver.findElement(By.name("username")),Username);
		typeInput(driver.findElement(By.name("password")),Password);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		Actualtitle=driver.getTitle();
		Assert.assertEquals(Actualtitle,"OrangeHRM");
	}
	@AfterMethod
	public void update() {
		ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",5,3,"OrangeHRM");
		ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",5,4, Actualtitle);
		if(Actualtitle.equals("OrangeHRM")) {
			ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",5,5,"Passed");
		}else {
			ExcelUtility.updateExcelContent("C:\\automation\\software\\Mavendummyproject\\src\\main\\resources\\test\\AppTest.xlsx","TC",5,5,"Failed");
		}
	}
	
	

}
