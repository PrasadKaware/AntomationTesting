package test;
import utilities.DateUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Orangehrm extends SeleniumUtil {
	WebDriver driver;
	DateUtility d1=new DateUtility();
	@BeforeTest
	public void openpage() {
		driver=setUp("chrome"," https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
  @Test()
  public void Loginpage() {
	  typeInput(driver.findElement(By.name("username")),"Admin");
	  typeInput(driver.findElement(By.name("password")),"admin123");
	  clickOnElement(driver.findElement(By.className("oxd-button")));
  }
  @Test(priority= 1)
  public void pim() {
	  clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
  }
  @Test(priority= 2)
  public void AddEmploy() {
	  clickOnElement(driver.findElement(By.xpath("//a[text()='Add Employee']")));
  }
  @Test(priority= 3)
  public void Add() {
	  typeInput(driver.findElement(By.name("firstName")),"admin");
	  typeInput(driver.findElement(By.name("middleName")),"007");
	  typeInput(driver.findElement(By.name("lastName")),"gun");
	  WebElement employee=driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input"));
	  employee.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	  employee.sendKeys("0707");
	  clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
  }
  @Test(priority=4)
  public void detail() {
	  WebElement day=driver.findElement(By.xpath("//div[div[label[text()='License Expiry Date']]]/div[2]/div/div/input"));
	  d1.getRequiredDateBasedOnNumberOfDays("yyyy-mm-dd",10);
  }
}
