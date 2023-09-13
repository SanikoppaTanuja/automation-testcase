package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Example {

	public static void main(String[] args) throws InterruptedException {
		 
		
	
	
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.javatpoint.com/java-tutorial");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	
	}

} 
