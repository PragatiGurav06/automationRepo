package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("pass");
		driver.findElement(By.xpath("//div[contains(text(),()]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
