package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActitimeAdd extends SeleniumUtility {
	public ActitimeAdd (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//div[text()='Add New']")
private WebElement Addnew;
@FindBy(css=".createNewTasks")
private WebElement Newtask;

public void getClick() {
	clickOnElement(Addnew);
}
public void Creat() {
	clickOnElement(Newtask);
}
}
