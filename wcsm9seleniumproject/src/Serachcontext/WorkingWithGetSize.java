package Serachcontext;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://pagi/login.do");
	   WebElement UserNameTextFild= driver.findElement(By.name("Username"));
	   // I Will pass Admin inside usertextfield
	    
	   
	    

	}

}
