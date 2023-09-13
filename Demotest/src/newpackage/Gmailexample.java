package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Gmailexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://accounts.google.com/signup/v2/createaccount?theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp
		ChromeOptions options=new ChromeOptions();//
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://accounts.google.com/signup/v2/createaccount?theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tanuja");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement e1=driver.findElement(By.xpath("//select[@id='month']"));
		e1.click();
		Select month=new Select(e1);
		month.selectByVisibleText("June");
	
	
	
	
	}


}
