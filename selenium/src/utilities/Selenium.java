package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static WebDriver setup(String browsername,String url) {
		WebDriver driver=null;
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get(url);
	return driver;

}
}