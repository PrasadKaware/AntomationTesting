package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class GoogleSearch extends SeleniumUtility {
	WebDriver driver;
	String textToSearched,ExpectedTilte;
	@Given("User have already ULR (.+)")
	public void GooglePage(String url) {
		driver=setUp("chrome","url");
	}
	@When("user type (.+) in google search,click on search")
	public void Search() {
		typeInput(driver.findElement(By.name("q")),"textToSearched");
	}
	@Then("verify the (.+) in searched page")
	public void title() {
		driver.getTitle();
	}
	@And("close the Open Browser")
	public void close() {
		driver.close();
	}

}
