package Locators;

import java.awt.Window;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocatores1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	//username textfield
	driver.findElement(By.name("username")).sendKeys("8308078230");
	driver.findElement(By.name("password")).sendKeys("Pragatig@123");
	Thread.sleep(2000);
	driver.findElement(By.className("_acap")).click();

}
}