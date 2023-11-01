package pomorangehrm;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PersonalInformation extends SeleniumUtility {
	public PersonalInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[div[label[text()='License Expiry Date']]]/div[2]/div/div/input")
	private WebElement Licensedate;

	@FindBy(xpath = "//div[div[label[text()='Nationality']]]/div[2]/div/div/div[1]")
	private WebElement Nationality;

	@FindBy(xpath = "//div[@role='listbox']/div")
	private List<WebElement> countries;

	@FindBy(xpath = "//div[div[label[text()='Marital Status']]]/div[2]/div/div/div[1]")
	private WebElement Status;

	@FindBy(css = "div.oxd-select-dropdown>div")
	private List<WebElement> Statuslist;

	@FindBy(xpath = "//div[div[label[text()='Date of Birth']]]/div[2]/div/div/input")
	private WebElement DOB;

	@FindBy(xpath = "//div[div[label[text()=\"Gender\"]]]/div[2]/div/div[2]")
	private List<WebElement> Gender;

	@FindBy(xpath = "//div[p[text()=' * Required']]/button")
	public WebElement Saved;

	public void Marital_Status() {
		clickOnElement(Status);

	}
	
	public void getStatus(String MStatus) {
		for(int i=0;i<Statuslist.size();i++) {
			WebElement status=Statuslist.get(i);
			if(getTextFromElement(status).equals(MStatus)) {
				clickOnElement(Statuslist.get(i));
				break;
			}
		}
	}
	
	public void DateOfBirth(String date) {
		DOB.clear();
		DOB.sendKeys(date);
	}
	
	public void GEnder(String gender) {
		for(int i=0;i<Gender.size();i++) {
			WebElement genderlist=Gender.get(i);
			if(getTextFromElement(genderlist).equals(gender)) {
				clickOnElement(Gender.get(i));
				break;
			}
		}
	}
	
	public void SaveInform() {
		clickOnElement(Saved);
	}
	// yyyy-mm-dd
	public void Licenses(String Date) {
		Licensedate.clear();
		Licensedate.sendKeys(Date);
	}

	public void Nation() {
		clickOnElement(Nationality);
	}

	public void NationList(String nation) {
		for (int i = 0; i < countries.size(); i++) {
			WebElement list = countries.get(i);
			if (getTextFromElement(list).equals(nation)) {
				clickOnElement(countries.get(i));
			}
		}
	}
}
