package swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Steptwo extends SeleniumUtility {
	public Steptwo (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="finish")
	private WebElement finish;
	
	public void Click() {
		clickOnElement(finish);
	}
}
