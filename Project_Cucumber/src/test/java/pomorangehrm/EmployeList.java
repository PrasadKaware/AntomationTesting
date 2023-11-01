package pomorangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class EmployeList extends SeleniumUtility{
	public EmployeList(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(css="//a[text()='Add Employee']")
	private WebElement AddEmploye;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement EmployId;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Search;
	
	@FindBy(css=".orangehrm-container>*:first-child>*:first-child>div>*:first-child>div")
	private WebElement id;
	
	@FindBy(css=".bi-trash")
	private WebElement delete;
	
	@FindBy(xpath="//div[@role='document']/div[3]/button[2]/i")
	private WebElement Deleted;
	
	public WebElement Addemploye() {
		return AddEmploye;
	}
	
	public WebElement Id() {
		return EmployId;
	}
	
	public WebElement search() {
		return Search;
	}
	
	public WebElement checkId() {
		return id;
	}
	
	public WebElement clickOndelet() {
		return delete;
	}
	
	public WebElement  ConfirmDeleted() {
		return Deleted;
	}
	
	public void clickOnAddEmploye() {
		clickOnElement(AddEmploye);
	}
	
	public void textId(int idno) {
		typeInput(EmployId,String.valueOf(idno));
		
	}
	
	public void SearchClick() {
		clickOnElement(Search);
	}
	
	public void MarkID() {
		clickOnElement(id);
	}
	
	public void DeleteId() {
		clickOnElement(delete);
	}
	
	public void DEleted() {
		clickOnElement(Deleted);
	}
}
