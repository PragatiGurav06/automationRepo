package Serachcontext;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFindElement1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 
		//search i pad in flipkart
		driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
		//identify all the ipad name and print it
		List<WebElement> ipadName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		//identify ipad prize and print it
		List<WebElement> ipadPrize=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		//for each loop
		for(WebElement name:ipadName)
		{
			System.out.println(name.getText());
		}
		
		//for loop
		//for(int i=)
		
		
	}

}
