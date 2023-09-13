package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Salesforceosignup {
	@Test
	public static void form() throws Exception
	{
		SoftAssert softassert=new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\Downloads\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.manage().window().maximize();
		
		Thread.sleep(12000);
		
		System.out.println(driver.getTitle());
		
		softassert.assertEquals(0, 0, null)
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//section[@label='Full Name']")).sendKeys("Tanuj Sanikopppai");
		//driver.findElement(By.xpath("//section[@label='Email']")).sendKeys("tanuja.sanikoppa@gmail.com");
		//sc-1o2pknd-1 iPRmnw
		//driver.findElement(By.className("sc-1o2pknd-1 iPRmnw")).click();
		
		//input[@Name='UserFirstName']*/
		driver.findElement(By.xpath("//input[@Name='UserFirstName']")).sendKeys("Tan");
		driver.findElement(By.xpath("//input[@Name='UserLastName']")).sendKeys("Sanikoppa");
		driver.findElement(By.xpath("//input[@Name='UserTitle']")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@Name='UserEmail']")).sendKeys("tanuja.rpea16@gmail.com");
		driver.findElement(By.xpath("//input[@Name='UserPhone']")).sendKeys("8762820400");
		
		
		
		List<WebElement> employess=driver.findElements(By.xpath("//select[@name='CompanyEmployees']/option")); 
		System.out.println(employess.size());
		employess.get(2).click();
		
	
		
		
		driver.findElement(By.xpath("//input[@Name='CompanyName']")).sendKeys("testyantrasolutions");
		
		/*List<WebElement> country1=driver.findElements(By.xpath("//select[@name='CompanyCountry']/option")); 
		System.out.println(country1.size());
		country1.get(10).click();*/
		
		WebElement region=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select countryregion=new Select(region);
		 countryregion.selectByIndex(1);
		 System.out.println(countryregion.getFirstSelectedOption().getText());
		 
		 
		 List<WebElement> dropdown=countryregion.getOptions();
		 for(int i=0; i<dropdown.size(); i++ )
		 {
			 if(dropdown.get(i).getText().equalsIgnoreCase("China"))
				 {
				  dropdown.get(i).click();
				  
				 
			 }
		 }
	
		region.sendKeys("Inda");
		driver.findElement(By.xpath("//select[@name='CompanyCountry']")).sendKeys("United States");
		
		
		 
		
		/*WebElement state=driver.findElement(By.xpath("//select[@name='CompanyState']"));
		Select selectstate= new Select(state);
		selectstate.selectByIndex(1);*/
		
		
		
		WebElement country2=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry2= new Select(country2);
		selectcountry2.selectByVisibleText("United States");
		
		WebElement country3=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry3= new Select(country3);
		selectcountry3.selectByVisibleText("Afghanistan");
		
		WebElement country4=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry4= new Select(country4);
		selectcountry4.selectByVisibleText("Albania");
		
		WebElement country5=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry5 =new Select (country5);
 		selectcountry5.selectByVisibleText("Algeria");
		
		WebElement country6=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry6 =new Select (country6);
		selectcountry6.selectByVisibleText("American Samoa");
		
		WebElement country7=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry7 =new Select (country7);
		selectcountry7.selectByVisibleText("American Samoa");
		

		WebElement country8=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry8 =new Select (country8);
		selectcountry8.selectByVisibleText("Anguilla");
		
		WebElement country9=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry9 =new Select (country9);
		selectcountry9.selectByVisibleText("Antarctica");
		
		
		

		WebElement country10=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry10 =new Select (country10);
		selectcountry10.selectByVisibleText("Antigua Barbuda");
		
		
		WebElement country11=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select selectcountry11 =new Select (country11);
		selectcountry11.selectByIndex(5);
		
	
		
		
		
		
		
		WebElement state=driver.findElement(By.xpath("//select[@name='CompanyState']"));
		Select selectstate= new Select(state);
		selectstate.selectByVisibleText("Hunan");*/
	
	
		
		Thread.sleep(2000);
		
	
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 1500)");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Main Services Agreement")).click();
		//driver.navigate().to("https://www.salesforce.com/content/dam/web/en_us/www/documents/legal/salesforce_MSA.pdf");
		//driver.navigate().back();
		
		
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
}

}
