package Serachcontext;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 
		//search i pad in flipkart
		driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
		//identify all the ipad name and print it
		List<WebElement> ipadName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		//for each loop
		for(WebElement name:ipadName)
		{
			System.out.println(name.getText());
		}
}
}


