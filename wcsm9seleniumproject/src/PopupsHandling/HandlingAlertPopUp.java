package PopupsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to demo app
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on alert box button
		driver.findElement(By.id("buttonAlert2")).click();
		//switch to control from main page to alert popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		//use accept()
		alt.accept();
		
	}

}
