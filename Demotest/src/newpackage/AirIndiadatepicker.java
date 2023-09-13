package newpackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AirIndiadatepicker
{

	public static void main(String[] args) throws Exception {
		

		String expectedmonth="DEC 2023";
		//String expetedyear="2023";
		String expectedreturnmonth="JAN 2024";
		
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("h*ttps://www.easemytrip.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		while(true)
		{
			String departuremontyear=driver.findElement(By.xpath("//div[@class='month2']")).getText();
			if((departuremontyear).equals(expectedmonth))
			break;		
				else        
		          {
					driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
		             }
		}
			
		
	List <WebElement> departuredate=driver.findElements(By.xpath("//ul[@class='bor-d61']/li"));
	System.out.println(departuredate.size());
	departuredate.get(4).click();
	
	driver.findElement(By.className("srchBtnSe")).click();
	
	/*Thread.sleep(3000);
	driver.findElement(By.id("rdate")).click();
	while(true)
	{
		String departuremontyear=driver.findElement(By.xpath("//div[@class='month2']")).getText();
		if((departuremontyear).equals(expectedreturnmonth))
		break;		
			else        
	          {
				driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
	             }
	}
		
	
List <WebElement> returndate=driver.findElements(By.xpath("//ul[@class='bor-d31']/li"));
System.out.println(returndate.size());
departuredate.get(10).click();



driver.findElement(By.className("srchBtnSe")).click();*/
	
	
	
		
	
	
	
			
		
		
	

}
}

