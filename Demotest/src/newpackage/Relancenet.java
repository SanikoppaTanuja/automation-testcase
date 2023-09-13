package newpackage;

import static org.testng.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Relancenet {
	@Test
	public void links() throws Exception
	{
		ChromeOptions options=new ChromeOptions();//
		options.addArguments("disable-notifications");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.jiomart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Mobile");
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
		List<WebElement> l1=driver.findElements(By.xpath("//li[@class='jm-list']"));
		System.out.println(l1.size());
		l1.get(2).click();
		System.out.println(l1.get(3).isSelected());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 1000)");
        Thread.sleep(5000);
		
		WebElement s1=driver.findElement(By.xpath("//div[@aria-valuemin='10' and @data-handle-key='0']"));
		act.dragAndDropBy(s1, 100, 0).perform();
		
		
	assertNotEquals(s1, s1);
		
}
}
