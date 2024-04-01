package DropDownHandling;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//navigate to demo App
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		//driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		//click on dropdown
		driver.findElement(By.xpath("//section[text()='Dropdown']"));
        WebElement dropdown = driver.findElement(By.id("select3"));
        //create the object of select class
        Select s = new Select(dropdown);
       //use the method selectByIndex
        s.selectByIndex(4);
	}
}
