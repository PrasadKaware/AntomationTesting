package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DateUtility;

import utilities.SeleniumUtility;

public class Personaldetails extends SeleniumUtility {
	public Personaldetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[div[label[text()='License Expiry Date']]]/div[2]/div/div/input")
	private WebElement calendar;

	@FindBy(xpath = "//div[div[label[text()='Nationality']]]/div[2]/div/div/div[1]")
	private WebElement nation;

	@FindBy(xpath = "//div[div[label[text()='Nationality']]]/div[2]/div/div[2]/div/span[text()='Indian']")
	private WebElement nationality;

	@FindBy(xpath = "//div[div[label[text()='Marital Status']]]/div[2]/div/div/div[1]")
	private WebElement status;

	@FindBy(xpath = "//div[div[label[text()='Marital Status']]]/div[2]/div/div[2]/div")
	private List<WebElement> statuslist;
	
	@FindBy(xpath="//div[div[label[text()='Date of Birth']]]/div[2]/div/div/input")
	private WebElement DOB;
	
	@FindBy(xpath="//div[div[label[text()='Gender']]]/div[2]/div")
	private List<WebElement> gender;
	
	@FindBy(xpath="//div[p[text()=' * Required']]/button")
	private WebElement save;
	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement employlist;

	public void getDate(String date) {
		//yyyy-mm-dd
		calendar.clear();
		calendar.sendKeys(date);
	}

	public void clickOnnation() {
		clickOnElement(nation);
	}

	public void getNation() {
		clickOnElement(nationality);
	}

	public void Status() {
		clickOnElement(status);
	}

	public void getStatus(String text) {
		for (int i = 0; i < statuslist.size(); i++) {
			WebElement list = statuslist.get(i);
			if (getTextFromElement(list).equals(text)) {
				clickOnElement(statuslist.get(i));
				break;
			}
		}
	}
	public void Dateofbirth(String date) {
	DOB.clear();
	DOB.sendKeys(date);
	}
	public void Gender(String text) {
		for(int i=0;i<gender.size();i++) {
			WebElement genderlist=gender.get(i);
			if(getTextFromElement(genderlist).equals(text)) {
				clickOnElement(gender.get(i));
				break;
			}
		}
	}
	public void getSave() {
		clickOnElement(save);
	}
	public void personaldetails(String expirydate,String dateofbirth ) {
		calendar.clear();
		calendar.sendKeys(expirydate);
		clickOnElement(nation);
		clickOnElement(nationality);
		DOB.clear();
		DOB.sendKeys(dateofbirth);		
	}
	public void Status(String Status,String Gender) {
		clickOnElement(status);
		for (int i = 0; i < statuslist.size(); i++) {
			WebElement list = statuslist.get(i);
			if (getTextFromElement(list).equals(Status)) {
				clickOnElement(statuslist.get(i));
				break;
			}
		}
		for(int i=0;i<gender.size();i++) {
			WebElement genderlist=gender.get(i);
			if(getTextFromElement(genderlist).equals(Gender)) {
				clickOnElement(gender.get(i));
				break;
			}
		}
	clickOnElement(save);	
	clickOnElement(employlist);
	}
}
