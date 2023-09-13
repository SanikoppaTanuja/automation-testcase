package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/hotels/");
		driver.manage().window().maximize();
	driver.findElement(By.id)
		
		
		driver.switchTo().frame("webengage-engagement-callback-frame");
		
	

	}

}
