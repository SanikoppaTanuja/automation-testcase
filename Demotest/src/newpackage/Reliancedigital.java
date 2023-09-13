package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Reliancedigital {
	@Test
	
	
		List <WebElement> t1 = driver.findElements(By.xpath("//table[@class='ng-scope']/tbody/tr/td[1]"));
		System.out.println(t1.size());
		
		List <WebElement> t2 = driver.findElements(By.xpath("//table[@class='ng-scope']/tbody/tr/td[1]"));
		System.out.println(t2.size());
			
		String typeofinsrument="Index Future";
		for(int i=0; i<t1.size(); i++)
		{
			if(t1.get(i).getText().equals(typeofinsrument))
			{
				System.out.println(t1.get(i).getText()+"===="+t2.get(i).getText());
				Thread.sleep(3000);
				t1.get(i).click();
			}
		}
	}
}
	



