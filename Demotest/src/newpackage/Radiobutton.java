package newpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

	public static void(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.linkText("Bus")).click();
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//input[@ id='txtSrcCity']")).click();
		
		
		//Select select=new Select(ddown);
		//select.selectByIndex(0);
		
	
		/*driver.findElement(By.xpath("//input[@id='chkArmy']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='chkArmy']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='chkArmy']")).click();
		driver.findElement(By.xpath("//input[@id='chkArmy']")).isSelected();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chkStudent']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chkSeniorCitizen']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chkDoctors']")).click();*/
		
		
		List<WebElement>  radios= driver.findElements(By.xpath("//input[@name='FF']"));
		System.out.println("Total radio buttons  " +radios.size());
		String expResult="Students";
		for(int i=0; i<radios.size(); i++)
		{
			if(radios.get(i).getText().equalsIgnoreCase(expResult))
			{
				radios.get(i).click();
				System.out.println(expResult +"clicked");
				break;
			}
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		


