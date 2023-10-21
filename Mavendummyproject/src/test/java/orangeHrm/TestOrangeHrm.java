package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.AddEmploye;
import pom.Employveiwlist;
import pom.Orangehrmdashboard;
import pom.PIMloginpage;
import pom.Personaldetails;
import test.Orangehrm;
import utilities.SeleniumUtility;

public class TestOrangeHrm extends SeleniumUtility {
	WebDriver driver;
	PIMloginpage getPIMloginpage;
	Orangehrmdashboard getOrangehrmdashboard;
	AddEmploye getAddEmploye;
	Employveiwlist getEmploylist;
	Personaldetails getpersonaldetails;

	@BeforeTest
	public void Precondition() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getPIMloginpage = new PIMloginpage(driver);
		getOrangehrmdashboard = new Orangehrmdashboard(driver);
		getAddEmploye = new AddEmploye(driver);
		getEmploylist = new Employveiwlist(driver);
		getpersonaldetails = new Personaldetails(driver);
	}

	@Test(priority = 1)
	public void LoginPage() {
		getPIMloginpage.getusername("Admin", "admin123");

	}

	@Test(priority = 2)
	public void PIMclick() {
		getOrangehrmdashboard.Clickpim();
	}

	@Test(priority = 3)
	public void veiw() {
		getEmploylist.clickAdd();
	}

	@Test(priority = 4)
	public void AddEmploye() {
		getAddEmploye.Addemploye("admin", "007", "gun", 1998);
	}

	@Test(priority = 5)
	public void PersonalDetails() {
		getpersonaldetails.personaldetails("2019-10-10", "1998-05-01");
	}

	@Test(priority = 6)
	public void status() {
		getpersonaldetails.Status("Single", "Male");
	}

	@Test(priority = 7)
	public void Deletedetails() {
		getEmploylist.delEmployedata("1998");
	}
}
