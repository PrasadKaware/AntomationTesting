package pomorangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Loginpage extends SeleniumUtility {
	public Loginpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	private WebElement Username;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(className="oxd-button")
	private WebElement Submit;
	
	public WebElement username() {
		return Username;
	}
	
	public WebElement password() {
		return Password;
	}
	
	public WebElement Login() {
		return Submit;
	}
	
	public void UserName(String name) {
		typeInput(Username,name);
	}
	
	public void PassWord(String Pword) {
		typeInput(Password,Pword);
	}
	
	public void Submit() {
		clickOnElement(Submit);
	}
	
	
}
