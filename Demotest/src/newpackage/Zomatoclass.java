package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatoclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("ada");
	}

}
