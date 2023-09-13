package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookexample {


		public static void main(String[] args) throws Exception {
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			System.out.println(driver.getTitle());
			//a[contains(@id,'u_0_0_2i')]
			driver.findElement(By.linkText("Create new account")).click();
			
			
			//List <WebElement> birthmonth=driver.findElements(By.xpath("//select[@id='month']/option"));
			//System.out.println("total no of months  " + birthmonth.size());
			//birthmonth.get(4).click();
			
			WebElement bm=driver.findElement(By.xpath("//select[@id='month']"));
			Select month=new Select(bm);
			month.selectByVisibleText("Jan");
}
}

