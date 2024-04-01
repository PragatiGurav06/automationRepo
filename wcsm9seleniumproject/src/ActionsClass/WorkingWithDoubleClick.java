package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//nevogate to demo app
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		WebElement yesButton = driver.findElement(By.id("btn20"));
		
		//create the obj of Actions class
		Actions act=new Actions(driver);
		
		act.doubleClick(yesButton).perform();
		
		
	
	}

}
