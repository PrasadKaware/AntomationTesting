package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pom.AddEmploye;
import pom.Employveiwlist;
import pom.Orangehrmdashboard;
import pom.PIMloginpage;
import pom.Personaldetails;
import utilities.SeleniumUtility;

public class OrangeHRM extends SeleniumUtility{
WebDriver driver;
PIMloginpage getPIMloginpage;
Orangehrmdashboard getOrangehrmdashboard;
AddEmploye getAddEmploye;
Employveiwlist getEmploylist;
Personaldetails getpersonaldetails;
@Given("user Already in login page")
public void user_already_in_login_page() {
	driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	getPIMloginpage = new PIMloginpage(driver);
	getOrangehrmdashboard = new Orangehrmdashboard(driver);
	getAddEmploye = new AddEmploye(driver);
	getEmploylist = new Employveiwlist(driver);
	getpersonaldetails = new Personaldetails(driver);
}

@When("user input valid username")
public void user_input_valid_username() {
   getPIMloginpage.Username("Admin");
}

@When("user input valid password")
public void user_input_valid_password() {
    getPIMloginpage.Password("admin123");
}

@When("user click on the login button")
public void user_click_on_the_login_button() {
 getPIMloginpage.clicklogin();
}
@When("click on the pim")
public void And_click_on_the_pim() {
	getOrangehrmdashboard.Clickpim();
}
@When("user click on the Add Employe")
public void user_click_on_the_add_employe() {
	getEmploylist.clickAdd();
}

@When("user fill the firstname,middle name,last name and emplyoeid ,saveit")
public void user_fill_the_firstname_middle_name_last_name() {
	getAddEmploye.Addemploye("Admin", "gun", "007", 1992);
}
@When("user is filled License date")
public void user_is_filled_license_date() {
	getpersonaldetails.getDate("2019-05-01");
}

@When("clicked on the nation")
public void clicked_on_the_nation() {
	getpersonaldetails.clickOnnation();
}

@When("user is selected the nation")
public void user_is_selected_the_nation() {
	getpersonaldetails.getNation();
}

@When("user click on the status")
public void user_click_on_the_status() {
	getpersonaldetails.Status();
}

@When("user selected the status")
public void user_selected_the_status() {
	getpersonaldetails.getStatus("Single");
}

@When("user is given the date of birth")
public void user_is_given_the_date_of_birth() {
	getpersonaldetails.Dateofbirth("1998-05-01");
}

@When("user is selcted the gender")
public void user_is_selcted_the_gender() {
	getpersonaldetails.Gender("Male");
}

@When("user is saved the details")
public void user_is_saved_the_details() {
	getpersonaldetails.getSave();
}
@And("close it") 
public void close () {
	driver.close();
}
@When("user is type in employeid field")
public void user_is_type_in_employeid_field() {
	getEmploylist.inputid("1992");
}

@When("click on the search button")
public void click_on_the_search_button() {
	getEmploylist.Search();
}

@When("click on the check box")
public void click_on_the_check_box() {
	getEmploylist.CheckBox();
}

@When("click on the delete")
public void click_on_the_delete() {
	getEmploylist.delet();
}

@When("given confrimation for delete")
public void given_confrimation_for_delete() {
	getEmploylist.Deleted();
}
@When("click on the profile")
public void click_on_the_profile() {
	getEmploylist.clickOnprofile();
}

@When("click on the logout")
public void click_on_the_logout() {
	getEmploylist.Logout();
}



}
