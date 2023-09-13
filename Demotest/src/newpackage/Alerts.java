package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(2000);
		
		
		
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
