package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggyexample {

		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.swiggy.com/restaurants/hotel-uday-bhuvan-deshmukh-road-tilakwadi-belgaum-102713");
					/*driver.findElement(By.className("r2iyh")).click();
					driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8762820400.");
					driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tanuja");
					driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tanuja.rpea162@gmail.com");
					//input[@type='submit']
					driver.findElement(By.xpath("//a[@class='a-ayg']")).click();*/
					JavascriptExecutor js = (JavascriptExecutor)driver;  
			        js.executeScript("scrollBy(0, 1500)"); 
					
					driver.findElement(By.xpath("//input[@name='Sambar']")).click();
					
	}

}
