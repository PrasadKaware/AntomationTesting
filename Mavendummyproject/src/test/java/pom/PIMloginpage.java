package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PIMloginpage extends SeleniumUtility{
   public PIMloginpage(WebDriver driver) {
	   PageFactory.initElements(driver,this);
   }
   @FindBy(name="username")
   private WebElement UsernameInput;
   @FindBy(xpath="//input[@type='password']")
   private WebElement PasswordInput;
   @FindBy(xpath="//button[@type='submit']")
   private WebElement Loginbutton;
   
   public void Username(String username) {
	   typeInput(UsernameInput,username);
   }
   public void Password(String psw) {
	   typeInput(PasswordInput,psw);
   }
   public void clicklogin() {
	   clickOnElement(Loginbutton);
   }
   public void getusername(String username,String password) {
	   typeInput(UsernameInput,username);
	   typeInput(PasswordInput,password);
	   clickOnElement(Loginbutton);
   }
}
