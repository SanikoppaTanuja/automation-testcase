package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swigylinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		/*List <WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0; i<links.size(); i++)
			{
			System.out.println("Toatal links" + links.size());
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
			}*/
	WebElement Loginbutton=driver.findElement(By.linkText("Login"));
	System.out.println(Loginbutton.isEnabled());
	System.out.println(Loginbutton.isDisplayed());
			  /
			
	
		
		
		
	}

}
