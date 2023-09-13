package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddroex {

	public static void main(Str
			ing[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/mysql/trymysql.asp?filename=trysql_select_avg");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.id("getwebsitebtn"));
		WebElement e2=driver.findElement(By.className( "CodeMirror-line"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(e1, e2).perform();
		
		
	}

}
