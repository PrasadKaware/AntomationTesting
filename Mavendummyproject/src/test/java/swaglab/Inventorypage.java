package swaglab;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Inventorypage extends SeleniumUtility {
	public Inventorypage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[div[a[div[text()='Sauce Labs Backpack']]]]/div[2]/button")
	private WebElement productA;
	
	@FindBy(xpath="//div[div[a[div[text()='Sauce Labs Bolt T-Shirt']]]]/div[2]/button")
	private WebElement productB;
	
	@FindBy(className="shopping_cart_link")
	private WebElement cart;
	
	public void Product1() {
		clickOnElement(productA);
	}
	public void Product2() {
		clickOnElement(productB);
	}
	
	public void Kart() {
		clickOnElement(cart);
	}
	public void Addcart() {
		clickOnElement(productA);
		clickOnElement(productB);
		clickOnElement(cart);
	}
	
}
