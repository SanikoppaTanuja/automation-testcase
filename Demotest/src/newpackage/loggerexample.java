package newpackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loggerexample {

	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("Log4JLogging");
		PropertyConfigurator.configure("C:\\Users\\Tanuja\\OneDrive\\Desktop\\Seleniumprograms\\Demotest\\Target\\log4j.properties");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/");
		
		driver.manage().window().maximize();
		logger.info("window maximized");
	}
}	
