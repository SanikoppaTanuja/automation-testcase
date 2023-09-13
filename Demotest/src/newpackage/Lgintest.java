package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lgintest {

	public static void .(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jio.com/selfcare/login/");
		driver.findElement(By.id("inputField")).sendKeys("8762820401*");
		driver.findElement(By.xpath("//button[@data-testid='generateOTPButton']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.linkText("Prepaid")).click();
		

	}

}
