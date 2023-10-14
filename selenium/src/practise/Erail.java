package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class Erail {
	public static WebDriver Setup(String browsername,String url) {
		WebDriver driver=null;
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =Setup("chrome","https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB);
	driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.className("addNewButton")).click();
	driver.findElement(By.className("createNewTasks")).click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".customerProjectSelectorPlaceholder>*:first-child>*:nth-child(2)>tbody>*:first-child>*:first-child>*:first-child>div>*:first-child"))).click();
	//driver.findElement(By.cssSelector(".customerProjectSelectorPlaceholder>*:first-child>*:nth-child(2)>tbody>*:first-child>*:first-child>*:first-child>div>*:first-child")).click();
	//.selectCustomerRow>td>*:first-child>div>*:nth-child(2)>div>*:first-child>div>div
	List<WebElement> customer =driver.findElements(By.cssSelector(".selectCustomerRow>*:first-child>.customerOrProjectSelector >div>*:last-child>div>*:first-child>div>div"));
	for(int i=0;i<customer.size();i++) {
		customer.get(0).click();
	System.out.println(" "+customer.get(i).getText());
	}
	/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[input[@placeholder='Enter Customer Name']]"))).sendKeys("prasad");
	driver.findElement(By.xpath("//div[input[@placeholder='Enter Customer Name']]")).sendKeys("prasad");
	driver.findElement(By.xpath("//td[input[@placeholder='Enter Project Name']]")).sendKeys("developer");
	driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();*/
	}

}
