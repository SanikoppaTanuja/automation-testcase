package newpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.collect.Iterators;

public class Airindiawindowhandler {

		public static void main(String[] args) throws Exception {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.airindia.com/");
		
		driver.manage().window().maximize();
		String windowID=driver.getWindowHandle();
		System.out.println(windowID);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 3200)"); 
        Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Tata Logo']")).click();
		Set<String> windowsids=driver.getWindowHandles();
		System.out.println(windowsids);
		
		Iterator<String> abc=windowsids.iterator();
		String win1=abc.next();
		String win2=abc.next();
		
		driver.switchTo().window(win1);
		System.out.println("Parent window"+ win1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(win2);
		System.out.println("Child window"+ win2);
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
	}

}
