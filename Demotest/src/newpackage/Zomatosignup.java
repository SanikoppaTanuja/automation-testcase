
package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Zomatosignup {

public static void main(String[] args) throws Exception 
{
			
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
					
WebDriver driver = new ChromeDriver();
					
driver.get("https://www.swiggy.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
System.out.println(driver.getTitle());
					
					System.out.println(driver.getCurrentUrl());
					
					driver.findElement(By.className("r2iyh")).click();
					driver.findElement(By.id("mobile")).sendKeys("8762820400");
			     	driver.findElement(By.id("name")).sendKeys("Tanuja");
					driver.findElement(By.id("email")).sendKeys("tanuja.rpea16@gmail.com");
					driver.findElement(By.className("a-ayg")).click();
					driver.findElement(By.className("_3p4qh")).click();
					driver.findElement(By.id("mobile")).sendKeys("8549077343");
					driver.findElement(By.className("a-ayg")).click();
					
							

}
}
