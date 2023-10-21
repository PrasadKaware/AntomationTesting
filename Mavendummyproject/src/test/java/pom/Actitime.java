package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Actitime extends SeleniumUtility {
	public Actitime(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userNameInput;
	@FindBy(name = "pwd")
	private WebElement passwordInputField;
	@FindBy(id = "loginButton")
	private WebElement clickOnlogin;
	public void getUsername(String Username) {
		typeInput(userNameInput,Username);
	}
	public void getPassword(String Password) {
		typeInput(passwordInputField,Password);
	}
	public void clickLogin() {
		clickOnElement(clickOnlogin);
	}
	public void ActitimePage(String Username,String Password) {
		typeInput(userNameInput,Username);
		typeInput(passwordInputField,Password);
		clickOnElement(clickOnlogin);
	}
}