package newpackage;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Amazonexample {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
	   // JavascriptExecutor js = (JavascriptExecutor)driver;  
        //js.executeScript("scrollBy(0, 1500)"); 
        
		/*List<WebElement> departments= driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		System.out.println(departments.size());
		departments.get(1).click();
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(2000);
		departments.get(2).click();
		Thread.sleep(2000);
		departments.get(3).click();
		Thread.sleep(2000);
		departments.get(4).click(); 
		Thread.sleep(2000);
		departments.get(5).click();
		Thread.sleep(2000);
		departments.get(6).click();
		Thread.sleep(2000);
		departments.get(7).click();
		Thread.sleep(2000);
		departments.get(8).click();
		Thread.sleep(2000);
		departments.get(9).click();
		Thread.sleep(2000);
		departments.get(10).click();
		
		
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		//a[@id='icp-nav-flyout']*/
		
	
		WebElement changelangauge= driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
		WebElement langauge =driver.findElement(By.xpath("//input[@value='es_US']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(changelangauge).moveToElement(langauge).click().perform();
		
		
		 

}
}																																									