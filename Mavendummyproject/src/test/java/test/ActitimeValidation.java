package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class ActitimeValidation extends SeleniumUtil {
	WebDriver driver;

	@BeforeTest
	public void setUpDriver() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
	}

	@Test
	public void Login() {
		typeInput(driver.findElement(By.id("username")), "admin");
		typeInput(driver.findElement(By.name("pwd")), "manager");
		clickOnElement(driver.findElement(By.id("loginButton")));
	}

	@Test(priority = 2)
	public void addnew() {
		clickOnElement(driver.findElement(By.xpath("//div[text()='Add New']")));
	}

	@Test(priority = 1)
	public void report() {
		clickOnElement(driver.findElement(By.id("container_tasks")));
	}

	@Test(priority = 3)
	public void add() {
		clickOnElement(driver.findElement(By.className("createNewTasks")));
	}
	@Test(priority=4,enabled=false)
	
		public void customer() {
		try{clickOnElement(driver.findElement(By.cssSelector(".customerSelector >div>*:first-child>*:first-child")));}
		catch(Throwable e) {
			e.printStackTrace();
		}
		waitUntilElementIsVisible(driver.findElement(By.cssSelector(".customerSelector >div>*:last-child>div>*:first-child>div")));
		List<WebElement> list=driver.findElements(By.cssSelector(".customerSelector >div>*:last-child>div>*:first-child>div"));
		for(int i=list.size()-1;i>=0;i--) {
			list.get(4).getText();
	}}
	@AfterTest
	public void off() {
		driver.close();
	}
}


