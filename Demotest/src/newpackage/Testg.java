package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testg {
	WebDriver driver;
	@BeforeClass
	public void setEnv()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	

		
		
	@DataProvider
	public Object[][] dataSet() throws Exception
		{
			File src3=new File("C:\\Users\\Tanuja\\OneDrive\\Desktop\\Seleniumprograms\\Demotest\\Repository\\testdata.properties");
			FileInputStream f3=new FileInputStream(src3);
			
			Properties prop=new Properties();
			prop.load(f3);
			Object arr[][]=new Object[3][2];
			arr[0][0]=prop.getProperty("TestData1");
			arr[0][1]=prop.getProperty("TestData2");
			
			return arr;
			
		}

	
	
	@Test(dataProvider = "dataSet")
	public void enterData(String username, String Password) throws Exception
	{
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(Password);
	}

	
	
}


