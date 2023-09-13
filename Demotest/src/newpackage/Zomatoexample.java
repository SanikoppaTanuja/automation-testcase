package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatoexample {

	
		public static void 0(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://www.zomato.com/");
					driver.manage().window().maximize();
					
					Thread.sleep(2000);
					
					System.out.println(driver.getTitle());
					
					System.out.println(driver.getCurrentUrl());
					
				    JavascriptExecutor js = (JavascriptExecutor)driver;  
			        js.executeScript("scrollBy(0, 1500)"); 
			        
			        //input[@value='mobile']
			        
			     List < WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
			     System.out.println("Total radi buttons"  + radios.size());
			     radios.get(0).clear();
			        
			  
					
				
					
					

			        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tanuja.sanikoppa@gmail.com");
					
				
					
					
					
					
					
					//driver.navigate().to("https://www.swiggy.com/");
					
					///driver.navigate().back();
					
					//driver.close();


}
}
