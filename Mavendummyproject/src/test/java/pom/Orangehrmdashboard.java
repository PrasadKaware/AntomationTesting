package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Orangehrmdashboard extends SeleniumUtility {
	public Orangehrmdashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	private WebElement pim;
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement dropdown;
	@FindBy(css = ".oxd-dropdown-menu>li")
	private List<WebElement> droplist;

	public void Clickpim() {
		clickOnElement(pim);
	}
	
	public void click() {
		clickOnElement(dropdown);
	}

	public void ClickMeanu(String text) {
		for (int i = 0; i < droplist.size(); i++) {
			WebElement list = droplist.get(i);
			if (getTextFromElement(list).equals(text)) {
				clickOnElement(droplist.get(i));
				break;
			}
		}
	}

}
