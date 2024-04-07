package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleByUsingIdOrAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to dream11 app
		driver.get("https://www.dream11.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//switch the control on frame by using id or attribute
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("9874563210");

	}

}
