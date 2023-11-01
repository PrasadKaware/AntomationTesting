package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pomorangehrm.Addemploye;
import pomorangehrm.DashBoard;
import pomorangehrm.EmployeList;
import pomorangehrm.Loginpage;
import pomorangehrm.PersonalInformation;
import utilities.SeleniumUtility;

public class OrangeHRM extends SeleniumUtility {
	WebDriver driver;
	Loginpage input;
	DashBoard click;
	EmployeList list;
	Addemploye add;
	PersonalInformation pim;

	@Given("user is already on the OrangeHRM Login page")
	public void user_is_already_on_the_orange_hrm_login_page() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		input = new Loginpage(driver);
		click = new DashBoard(driver);
		add = new Addemploye(driver);
		list = new EmployeList(driver);
		pim = new PersonalInformation(driver);
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		input.UserName("Admin");
	}

	@When("user enters the password")
	public void user_enters_the_password() {
		input.PassWord("admin123");
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		input.Submit();
	}

	@When("user clicks on the PIM \\(Personnel Information Management) menu")
	public void user_clicks_on_the_pim_personnel_information_management_menu() {
		click.Clickpim();
	}

	@When("user clicks on Add Employee")
	public void user_clicks_on_Add() {
		driver.findElement(By.cssSelector(".oxd-topbar-body-nav>ul>*:nth-child(3)")).click();
	}

	@When("user inputs the Firstname")
	public void user_inputs_the_firstname() {
		add.Firstname("Admin");
	}

	@When("user Middlename")
	public void user_middlename() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("middleName"))).sendKeys("Gun");
	}

	@When("user Last Name")
	public void user_last_name() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastName"))).sendKeys("power");
	}

	@When("user fills in the Employee ID")
	public void user_fills_in_the_employee_id() {
		add.IDno(2001);
	}

	@When("user clicks on Save")
	public void user_clicks_on() {
		add.Save();
	}

	@When("Add license expire date")
	public void add_license_expire_date() {
		pim.Licenses("2021-12-30");
	}

	@When("click on Nation")
	public void NAtion() {
		pim.Nation();
	}

	@When("Add the Nationality")
	public void add_the_nationality() {
		pim.NationList("Indian");
	}
	
	@When("Click ON Date Of Birth")
	public void click_on_date_of_birth() {
	    pim.DateOfBirth("1998-05-01");
	}

	@When("Click On Status drop down")
	public void click_on_status_drop_down() {
	    pim.Marital_Status();
	}

	@When("Click On Martial_status")
	public void click_on_martial_status() {
	    pim.getStatus("Single");
		
	}

	@When("select the gender")
	public void select_the_gender() {
	    pim.GEnder("Male");
	}

	@When("save the information")
	public void save_the_information() {
	    
		pim.SaveInform();
	}

}
