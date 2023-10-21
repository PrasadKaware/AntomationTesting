package pom;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class AddEmploye extends SeleniumUtility {
	public AddEmploye(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstName")
	private WebElement Inputfirstname;
	
	@FindBy(name="middleName")
	private WebElement inputmiddlename;
	
	@FindBy(name="lastName")
	private WebElement inputlastname;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeid;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;
	
	public void Firstname(String firstname) {
		typeInput(Inputfirstname,firstname);
	}
	public void Middlename(String middlename) {
		typeInput(inputmiddlename,middlename);
	}
	public void Lastname(String lastname) {
		typeInput(inputlastname,lastname);
	}
	public void Employeid(int id) {
		employeid.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		employeid.sendKeys(Keys.chord(Keys.BACK_SPACE));
		employeid.sendKeys(String.valueOf(id));
				
	}
	public void savebutton() {
		clickOnElement(save);
	}
	
	public void Addemploye(String firstname,String middlename,String lastname,int id) {
		typeInput(Inputfirstname,firstname);
		typeInput(inputmiddlename,middlename);
		typeInput(inputlastname,lastname);
		employeid.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		employeid.sendKeys(Keys.chord(Keys.BACK_SPACE));
		employeid.sendKeys(String.valueOf(id));
				
		clickOnElement(save);
	}
}
