package swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Loginpage extends SeleniumUtility {
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	public void UserName(String Username) {
		typeInput(username,Username);
	}
	public void PassWord(String Password) {
		typeInput(password,Password);
	}
	public void GetPageTitile() {
		getCurrentTitleOfApplication();
	}
	public void Loginbutton() {
		clickOnElement(loginbutton);
	}
	
	public void Login(String Username,String Password) {
		typeInput(username,Username);
		typeInput(password,Password);
		clickOnElement(loginbutton);
	}
}
