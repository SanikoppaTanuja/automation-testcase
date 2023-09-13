package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
							
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	   System.out.println(driver.getCurrentUrl());
	   driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Goa beach");
	   List <WebElement> autosugestions=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	   
	   System.out.println( autosugestions.size());
	   for(int i=0; i<autosugestions.size(); i++)
	   {
		   String expectedresults="Goa";
		   if(autosugestions.get(i).getText().equalsIgnoreCase(expectedresults))
		   {
			   autosugestions.get(i).click();
			   break;
		   }
	   }
	   
	   

	}

}
