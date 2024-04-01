package DropDownHandling;

import java.sql.Driver;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDuplicateOptionsDropdown {

	private static List<WebElement> duplicateOption;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/abhil/OneDrive/Desktop/dropdown.html");
		Select s =new Select(driver.findElement(By.id("dropdown")));
		@SuppressWarnings("unused")
		List<WebElement> duplicateOptions = s.getOptions();
		
		TreeSet<String> set=new TreeSet<String>();
		for(int i=0;i<duplicateOption.size();i++)
		{
		  String duplicate = duplicateOption.get(i).getText();
			set.add(duplicate);
		}
		
		for(String options:set)
		{
			System.out.println(options);
		}
		
				
				
				
				
				
		
	}

}
