package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprgram {

	
		public static void 36(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("xyz");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	
		String errormessage=driver.findElement(By.className("error-button")).getText();
		System.out.println(errormessage);
		
	}
}
