package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxexample {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/hotels/hotels-in-bangalore/?e=2023821115437&city=Bangalore,%20India&cin=22/08/2023&cOut=23/08/2023&Hotel=NA&Rooms=1&pax=2");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPrc1")).click();
	
	}

}
