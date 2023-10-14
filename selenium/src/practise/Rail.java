package practise;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Selenium;

public class Rail {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=Selenium.setup("chrome","https://erail.in/");
		String mainpage=driver.getWindowHandle();
		System.out.println("mani page id "+mainpage);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Tour Packages']"))).click();
		Set<String> newpage=driver.getWindowHandles();
		System.out.println("both page id "+newpage);
		newpage.remove(mainpage);
		Iterator<String> itr=newpage.iterator();
		String page=itr.next();
		driver.switchTo().window(page);
		
		driver.findElement(By.xpath("//label[text()='AHMEDABAD ']")).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='right-searchresult']/div/div")));
		List<WebElement> placelist=driver.findElements(By.xpath("//div[@class='right-searchresult']/div/div"));
		for(int i=0;i<placelist.size();i++) {
			System.out.println(" "+placelist.get(i).getText());
		
		}
		driver.close();
		driver.switchTo().window(mainpage);
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		driver.findElement(By.id("txtStationFrom")).sendKeys("pune jn",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		driver.findElement(By.id("txtStationTo")).sendKeys("Bangalore",Keys.TAB);
		driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("center>table>tbody>*:first-child")));
		String cmonth=driver.findElement(By.xpath("//td[text()='Oct-23']")).getText();
		while(cmonth.equals("Nov-23")){
			driver.findElement(By.xpath("//a[@class='icon-right-big']")).click();
			driver.findElement(By.xpath("//td[text()='Oct-23']")).getText();
		}
		driver.findElement(By.cssSelector("center>table>tbody>*:first-child>*:nth-child(2)>table>tbody>*:nth-child(4)>*:nth-child(5)")).click();
		
	}

}
