package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Reliancendia {

	
		@Test
		public void links() throws Exception
		{
			ChromeOptions options=new ChromeOptions();//
			options.addArguments("disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(options);
			
			
			driver.get("https://www.reliancedigital.in/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
}

}
