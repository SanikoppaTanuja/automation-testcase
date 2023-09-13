package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airindiaw {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
		String welcomemessage=driver.findElement(By.xpath("//div[@class='eb-bubble eb-you']")).getText();
		System.out.println(welcomemessage);
		Thread.sleep(3000)
		
;		
		driver.findElement(By.id("send_message_text")).sendKeys("hello");
		//img[@class='eb_widget_send_input_message']
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='eb_widget_send_input_message']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("eb_top_box_header_minimize")).click();
	}

}
