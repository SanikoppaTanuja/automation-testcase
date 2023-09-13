package newpackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jiomartexample {
	
	
	@BeforeTest()
	public void Login() throws Exception
	{	SoftAssert softasser=new SoftAsserts();
		ChromeOptions options=new ChromeOptions();//
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.jiomart.com/");
		driver.manage().window().maximize();
		String actualresults=driver.getTitle();		
		String expectedtitle="Jio";
		Assert.assertEquals(actualresults, expectedtitle);
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8549077343");
		driver.findElement(By.xpath("//div[text()=' Get OTP ']")).click();
	}
	
	
	@AfterTest()
	
	public void Logout() throws Exception
	{
		ChromeOptions options=new ChromeOptions();//
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.jiomart.com/customer/account");
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
	}
	
}



