package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tableexample {

	public static void main(String[] args) {
		//table[@class='ng-scope']/tbody/tr/td[4]
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.get("https://www.bseindia.com/");
		driver.manage().window().maximize();
		
	
		List <WebElement> t1 = driver.findElements(By.xpath("//table[@class='ng-scope']/tbody/tr/td[1]"));)
	}
}

