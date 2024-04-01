package Serachcontext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementOnMyntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		 
		//search pants on myntra
		driver.findElement(By.className("desktop-searchBar")).sendKeys("pants",Keys.ENTER);
		//identify all the pant name and print it
		List<WebElement> pantName=driver.findElements(By.xpath("//h3[@class='product-brand']"));
		
		//for each loop
		for(WebElement name:pantName)
		{
			System.out.println(name.getText());
		}	
}
}
