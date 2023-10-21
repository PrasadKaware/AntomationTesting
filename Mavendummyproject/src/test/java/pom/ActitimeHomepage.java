package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActitimeHomepage extends SeleniumUtility {
	public ActitimeHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "td.navItem ")
	private List<WebElement> navigationbar;

	public void clickOnReport(String text) {
		for (int i = 0; i < navigationbar.size(); i++) {
			WebElement list = navigationbar.get(i);
			if (getTextFromElement(list).equals(text)) {
				clickOnElement(navigationbar.get(i));
				break;

			}

		}
	}

}
