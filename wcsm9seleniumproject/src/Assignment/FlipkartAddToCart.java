package Assignment;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddToCart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("waterbottel",Keys.ENTER);
		//click on any water bottel
		driver.findElement(By.xpath("//a[text()='NIRLON Summer Cool Single Wall Stainless Steel Fridge W...'][1]")).click();
		
		//fatch parentwindow id
		String parentwindowId = driver.getWindowHandle();
		System.out.println(parentwindowId);
		
		//fatch parent as well as child window id
		Set<String> allwindowId = driver.getWindowHandles();
		
		
		for (String id: allwindowId)
		{
			driver.switchTo().window(id);
			if (driver.getTitle().contains("NIRLON Summer Cool Single Wall Stainless Steel Fridge W..."))
			{
				break;
			}
			
		}
		  Thread.sleep(2000);
		  //click on add to cart button
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		  Thread.sleep(2000);
		  //switch to parent window
		  driver.switchTo().window(parentwindowId);
		  
		  Thread.sleep(2000);
		  //click on cart
		  driver.findElement(By.xpath("//span[text()='Cart']")).click();
		  
		


	}

}
