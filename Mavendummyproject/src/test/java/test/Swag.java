package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Swag extends SeleniumUtil {
	WebDriver driver;
	@BeforeTest
	public void openwindow() {
		driver=setUp("chrome","https://www.saucedemo.com/");
	}
  @Test(priority=1)
  public void login () {
	  typeInput(driver.findElement(By.id("user-name")),"standard_user");
	  typeInput(driver.findElement(By.id("password")),"secret_sauce");
	  clickOnElement(driver.findElement(By.id("login-button")));
  }
  @Test(priority=2)
  public void product() {
	  clickOnElement(driver.findElement(By.xpath("//div[div[a[@id='item_4_title_link']]]/div[2]/button")));
	  clickOnElement(driver.findElement(By.xpath("//div[div[a[@id='item_1_title_link']]]/div[2]/button")));
	  clickOnElement(driver.findElement(By.className("shopping_cart_link")));
  }
  @Test(priority=3)
  public void kart() {
	  clickOnElement(driver.findElement(By.xpath("//button[text()='Checkout']")));
  }
  @Test(priority=4)
  public void details() {
	  typeInput(driver.findElement(By.id("first-name")),"Don");
	  typeInput(driver.findElement(By.id("postal-code")),"679332");
	  typeInput(driver.findElement(By.id("last-name")),"son");
	  clickOnElement(driver.findElement(By.id("continue")));
	  clickOnElement(driver.findElement(By.xpath("//button[text()='Finish']")));
	  clickOnElement(driver.findElement(By.xpath("//button[text()='Back Home']")));
	  
  }
  @AfterTest
  public void off() {
	  driver.close();
  }
  
}
