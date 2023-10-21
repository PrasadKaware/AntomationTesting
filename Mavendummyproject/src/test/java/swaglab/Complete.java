package swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Complete extends SeleniumUtility {
	public Complete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="back-to-products")
	private WebElement finished;
	public void complete() {
		clickOnElement(finished);
	}
}
