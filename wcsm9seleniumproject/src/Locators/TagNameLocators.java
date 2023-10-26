package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocators {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("filr:///C:/User/vikra/WebElement/Assignment.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("manager");
		Thread.sleep(2000);
		
	    driver.close();
	    
	}

}
