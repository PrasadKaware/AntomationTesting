package pomorangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class DashBoard extends SeleniumUtility{
	public DashBoard (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="ul>*:nth-child(2)>a")
	private WebElement PIM;
	
	public WebElement pim() {
		return PIM;
	}
	
	public void Clickpim() {
		clickOnElement(PIM);
	}
}
