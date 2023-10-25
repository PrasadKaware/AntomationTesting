package swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Checkoutstepone extends SeleniumUtility {
	public Checkoutstepone (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(id="last-name")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement zip;
	
	@FindBy(id="continue")
	private WebElement clickcontinue;
	
	public void FristName(String Firstname) {
		typeInput(firstname,Firstname);
	}
	public void LastName(String Lastname) {
		typeInput(lastname,Lastname);
	}
	public void ZipCode(String Zip) {
		typeInput(zip,Zip);
	}
	public void Continue() {
		clickOnElement(clickcontinue);
	}
	
	public void Filldetaisl(String Firstname,String Lastname,String Zip) {
		typeInput(firstname,Firstname);
		typeInput(lastname,Lastname);
		typeInput(zip,Zip);
		clickOnElement(clickcontinue);
	}
}
