package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesfoceexam {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.manage().window().maximize();
		
		Thread.sleep(12000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 1500)");
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		//button[@type='submit']
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
