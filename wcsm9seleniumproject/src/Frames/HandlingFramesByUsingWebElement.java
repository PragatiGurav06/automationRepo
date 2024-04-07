package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesByUsingWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to dream11 app
		driver.get("https://www.dream11.com/fantasy-cricket/ipl");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
		//switch the control on frame by using web element
		driver.switchTo().frame(1);
		driver.findElement(By.id("regEmail")).sendKeys("78945612385");

	}

}
