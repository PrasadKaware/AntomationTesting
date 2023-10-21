package swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Cartpage extends SeleniumUtility {
	public Cartpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="checkout")
	private WebElement checkout;
	
	public void Checkout() {
		clickOnElement(checkout);
	}

}
