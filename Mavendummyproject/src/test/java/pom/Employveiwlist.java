package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Employveiwlist extends SeleniumUtility {
	public Employveiwlist(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement Addemployee;

	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement list;

	@FindBy(xpath = "//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement inputID;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search;
	@FindBy(css = ".oxd-table-body>div>div>*:nth-child(1)>div")
	private WebElement check;

	@FindBy(xpath = ("//i[@class='oxd-icon bi-trash']"))
	private WebElement delete;

	@FindBy(css = ".orangehrm-modal-footer>*:nth-child(2)>i")
	private WebElement del;
	
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement profile;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public void clickAdd() {
		clickOnElement(Addemployee);
	}

	public void inputid(String a) {
		typeInput(inputID, a);
	}

	public void Search() {
		clickOnElement(search);
	}

	public void delet() {
		clickOnElement(delete);
	}

	public void Deleted() {
		clickOnElement(del);
	}

	public void Employe() {
		clickOnElement(list);
	}

	public void CheckBox() {
		clickOnElement(check);
	}
	public void clickOnprofile() {
		clickOnElement(profile);
	}
	public void Logout() {
		clickOnElement(logout);
	}

	public void delEmployedata(String ID) {
		typeInput(inputID, ID);
		clickOnElement(search);
		clickOnElement(check);
		clickOnElement(delete);
		clickOnElement(del);
		clickOnElement(profile);
		clickOnElement(logout);
		
	}
}
