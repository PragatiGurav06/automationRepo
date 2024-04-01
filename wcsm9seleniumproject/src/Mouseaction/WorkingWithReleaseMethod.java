package Mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithReleaseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to demo app
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		//create the object of action class
		Actions act = new Actions(driver);
		
		//use Click and Hold Action
		act.clickAndHold(driver.findElement(By.id("circle"))).perform();
		Thread.sleep(3000);
		//Use release()
		act.release().perform();

	}

}
