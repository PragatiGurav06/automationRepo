package Mouseaction;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to demo app
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
		
		//identify the drag element
        WebElement drag= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		//identify drop position;
	    WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		//create the object of action class
	    
	    Actions act = new Actions(driver);
	    
	    act.dragAndDrop(drag, drop).perform();
	}

}
