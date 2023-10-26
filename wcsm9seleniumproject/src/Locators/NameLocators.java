package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///c:User/vikra/Desktop/WebElement/radiobutton.html");
		Thread.sleep(2000);
		//identify a radio button by using name locators
		driver.findElement(By.name("name1")).click();
		Thread.sleep(2000);
		//identify D radio button by using name locators
		driver.findElement(By.name("name4")).click();
		Thread.sleep(2000);
		  
		

	}

}
