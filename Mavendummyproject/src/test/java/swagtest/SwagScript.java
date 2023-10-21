package swagtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import swaglab.Cartpage;
import swaglab.Checkoutstepone;
import swaglab.Complete;
import swaglab.Inventorypage;
import swaglab.Loginpage;
import swaglab.Steptwo;
import utilities.SeleniumUtility;

public class SwagScript extends SeleniumUtility{
	WebDriver driver;
	Loginpage getlogin;
	Inventorypage getproduct;
	Cartpage getCart;
	Checkoutstepone getone;
	Steptwo gettwo;
	Complete getfinish;
	
	@BeforeTest
	public void Preconditon() {
		driver=setUp("chrome","https://www.saucedemo.com/");
		getlogin=new Loginpage(driver);
		getproduct=new Inventorypage(driver);
		getCart=new Cartpage(driver);
		getone=new Checkoutstepone(driver);
		gettwo=new Steptwo(driver);
		getfinish=new Complete(driver);
	}
	
	@Test(priority=1)
	public void LogInPage() {
		getlogin.Login("standard_user","secret_sauce");
	}
	
	@Test(priority=2)
	public void ProductPage() {
		getproduct.Addcart();
	}
	
	@Test(priority=3)
	public void Kartpage() {
		getCart.Checkout();
	}
	
	@Test(priority=4)
	public void Address() {
		getone.Filldetaisl("prasad","kaware","679932");
	}
	
	@Test(priority=5)
	public void Confirm() {
		gettwo.Click();
	}
	
	@Test(priority=6)
	public void Done() {
		getfinish.complete();
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
