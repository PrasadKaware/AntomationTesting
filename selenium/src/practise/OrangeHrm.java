package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Selenium;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=Selenium.setup("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		driver.findElement(By.name("firstName")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("middleName")).sendKeys("007",Keys.TAB);
		driver.findElement(By.name("lastName")).sendKeys("gun");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[div[label[text()='License Expiry Date']]]/div[2]/div/div/input"))).click();
		driver.findElement(By.cssSelector(".oxd-calendar-wrapper>*:first-child>ul>*:first-child>div>p")).click();
		driver.findElement(By.xpath("//li[text()='August']")).click();
		driver.findElement(By.xpath("//div[div[label[text()='License Expiry Date']]]/div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//li[text()='2019']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='10']"))).click();
		//driver.findElement(By.xpath("//div[text()='10']")).click();
		//driver.findElement(By.xpath("//div[div[label[text()='Nationality']]]/div[2]/div/div/div[1]")).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[div[label[text()='Nationality']]]/div[2]/div/div/div[1]"))).click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Indian']"))).click();
		driver.findElement(By.xpath("//div[div[label[text()='Marital Status']]]/div[2]/div/div/div[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Single']"))).click();
		driver.findElement(By.xpath("//div[div[label[text()='Date of Birth']]]/div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//p[text()='October']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='January']"))).click();
		driver.findElement(By.xpath("//p[text()='2023']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='1998']"))).click();
		driver.findElement(By.xpath("//div[text()='5']")).click();
		driver.findElement(By.xpath("//div[div[label[text()='Gender']]]/div[2]/div[1]/div[2]/div/label/span")).click();
		driver.findElement(By.xpath("//div[p[text()=' * Required']]/button")).click();
		
		
	}

}
