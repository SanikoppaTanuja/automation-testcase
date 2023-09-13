package newpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG {
	@Test(dependsOnMethods="b")
	
	public  void a() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.easemytrip.com/");
				
				
				
			
				driver.findElement(By.linkText("Flights")).click();
				throw new SkipException("skip");
				
	}
	
	
		@Test(invocationCount=2)
		public  void b() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.easemytrip.com/");
		
					
					
					driver.findElement(By.linkText("Bus")).click();
					throw new SkipException("skip");
		}
		}
	

	
		
	
	
	
	

