package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MakemytripE {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tanuja\\Downloads\\geckodriver-v0.33.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.airindia.com/");
		driver.manage().window().maximize();
	
		
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0; i<links.size();i++)
		{
			links.get(i).getText();
			
		}*/
			
	WebElement bookandmanage =driver.findElement(By.xpath("//a[@id='headernav0']"));
	WebElement searchflights=driver.findElement(By.xpath("//a[@id='header0menu0link1']"));
	
	
	Actions act=new Actions(driver);
	act.moveToElement(bookandmanage).moveToElement(searchflights).click().build().perform();
	
	act.clickAndHold();
	act.contextClick().build().perform();
	
		
		Thread.sleep(3000);
		List<WebElement>radios=driver.findElements(By.xpath("//label[@class='mat-radio-label']"));
		System.out.println(radios.size());
		radios.get(0).click();
		Thread.sleep(3000);
		radios.get(1).click();
		
		//input[@id='From']
		driver.findElement(By.id("From")).click();
		//button[@role='option']
		List<WebElement> fromcity=driver.findElements(By.xpath("//button[@role='option']"));
		System.out.println(fromcity.size());
	    fromcity.get(206).click();
	    
	    driver.findElement(By.id("To")).click();
	    List<WebElement> tocity=driver.findElements(By.xpath("//button[@role='option']"));
	    tocity.get(125).click();
	
	  //mat-radio-button[@id='mat-radio-20']
	    driver.findElement(By.xpath("//mat-radio-button[@id='mat-radio-20']")).click();
	    
	  //mat-label[@class='label']*/
	    
	    
	    
	}	    
	
	}
