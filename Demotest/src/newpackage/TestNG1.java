package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	@BeforeSuite
	public void a()
	{
		System.out.println("aaa");
	
	}
	
	@BeforeTest
	public void c()
	{
		System.out.println("bbbb");
	}
	@BeforeClass
	public void d()
	{
		System.out.println("ccc");
	}
	@BeforeMethod	
	public void e()
	{
	System.out.println("ddd");
	}
	
	@Test	
	public void x()
	{
	System.out.println("eeee+");
	}
	@AfterMethod
	public void f()
			{
				System.out.println("b");
			}
	
			
			
			
			@AfterTest
			public void k()
			{
				System.out.println("b");
				
			}
			@BeforeClass
			public void z()
			{
				System.out.println("b");
			}

			@AfterSuite
			public void l()
					{
						System.out.println("a");
}}