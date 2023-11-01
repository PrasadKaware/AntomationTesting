package pomorangehrm;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Addemploye extends SeleniumUtility{
	public Addemploye(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(name="firstName")
	private WebElement Firstname;
	
	@FindBy(name="middlename")
	private WebElement Middlename;
	
	@FindBy(name="lastname")
	private WebElement Lastname;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement noId;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Save;
	
	public WebElement Fname() {
		return Firstname;
	}
	
	public WebElement Mname() {
		return Middlename;
	}
	
	public WebElement Lname() {
		return Lastname;
	}
	
	public void Firstname(String FirstName) {
		typeInput(Firstname,FirstName);
	}
	
	public void MiddleName(String MiddleNAME) {
		typeInput(Middlename,MiddleNAME);
	}
	
	public void LastName(String LastNAME) {
		typeInput(Lastname,LastNAME);
	}
	
	public void data(String name,String middlname,String lastname) {
		typeInput(Firstname,name);
		typeInput(Middlename,middlname);
		typeInput(Lastname,lastname);
	}
	
	public void Save() {
		clickOnElement(Save);
	}
	
	public void IDno(int num) {
		noId.sendKeys(Keys.CONTROL,"a");
		noId.sendKeys(Keys.BACK_SPACE);
		typeInput(noId,String.valueOf(num));
	}
}
