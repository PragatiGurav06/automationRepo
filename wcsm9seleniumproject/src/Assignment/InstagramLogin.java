package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		//username textfield
		driver.findElement(By.name("username")).sendKeys("8305078200");
		driver.findElement(By.name("password")).sendKeys("Pragatig@123");
		Thread.sleep(2000);
		driver.findElement(By.className("_acap")).click();
		
		
		

	}

}
