package MethodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.AdaptiveRecvByteBufAllocator;

public class IdLocators {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	     WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     Thread.sleep(20000);
	     driver.findElement(By.id("11")).sendKeys("admin");
	     
	     Thread.sleep(20000);
	     driver.findElement(By.id("12")).sendKeys("manager");
	     Thread.sleep(20000);
	     driver.findElement(By.tagName("Button")).click();
	     Thread.sleep(20000);
	     driver.close();
	     

	}

}
