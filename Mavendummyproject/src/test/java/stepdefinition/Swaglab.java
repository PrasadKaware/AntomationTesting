package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swaglab.Cartpage;
import swaglab.Checkoutstepone;
import swaglab.Complete;
import swaglab.Inventorypage;
import swaglab.Loginpage;
import swaglab.Steptwo;
import utilities.SeleniumUtility;

public class Swaglab extends SeleniumUtility {
	WebDriver driver;
	Loginpage getlogin;
	Inventorypage getProduct;
	Cartpage getcart;
	Checkoutstepone getCheck;
	Steptwo getfinish;
	Complete getCom;

	@Given("user Already in Loginpage")
	public void user_already_in_loginpage() {
		driver = setUp("chrome", "https://www.saucedemo.com/");
		getlogin = new Loginpage(driver);
		getProduct = new Inventorypage(driver);
		getcart = new Cartpage(driver);
		getCheck=new Checkoutstepone(driver);
		getfinish=new Steptwo(driver);
		getCom=new Complete(driver);
	}
	
	@Then("get page title {string}")
	public void get_page_title(String expectedtitle) {
	   String actual=driver.getTitle();
	   Assert.assertEquals(actual,expectedtitle);
	    
	}

	@Then("verify it contain msg {string}")
	public void verify_it_contain_msg(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@When("user type in Usernamefield")
	public void user_type_in_usernamefield() {
		getlogin.UserName("standard_user");
	}

	@When("user type passwordfield")
	public void user_type_passwordfield() {
		getlogin.PassWord("secret_sauce");
	}

	@When("click on login button")
	public void click_on_login_button() {
		getlogin.Loginbutton();
	}

	@When("click on addTocart Product1")
	public void click_on_add_tocart_product1() {
		getProduct.Product1();
	}

	@When("click on addTocart product2")
	public void click_on_add_tocart_product2() {
		getProduct.Product2();
	}

	@When("click on the kart")
	public void click_on_the_kart() {
		getProduct.Kart();
	}

	@When("click on checkout")
	public void click_on_checkout() {
		getcart.Checkout();
	}

	@When("give the inputName")
	public void give_the_input_name() {
		getCheck.FristName("prasad");
	}

	@When("give the lastname")
	public void give_the_lastname() {
		getCheck.LastName("007");
	}

	@When("the zipcode")
	public void the_zipcode() {
		getCheck.ZipCode("679332");
	}
	@When("click on continue")
	public void Continue() {
		getCheck.Continue();
	}

	@When("click on the finish button")
	public void click_on_the_finish_button() {
		getfinish.Click();
	}

	@When("click on the back to home")
	public void click_on_the_back_to_home() {
		getCom.complete();
	}
	
}
