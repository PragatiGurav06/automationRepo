package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentOnXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//handle hidden division pop up
		driver.findElement( By.xpath("//span[text()='✕']")).click();
		//identify search box
		driver.findElement(By.name("q")).sendKeys("mobiles");
		//identify search icon and click.
		driver.findElement(By.xpath(""));
		//print the price of 2nd position
		String price=driver.findElement(By.xpath(""))
		
		
		
		
		
		
		
		
		

	}

}
