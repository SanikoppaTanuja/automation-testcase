package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatSignup 
	{
	public static void main(String[] args)
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.zomato.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	driver.quit();
	//111111116driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("Tanua Sanikoppa");

	}
}


