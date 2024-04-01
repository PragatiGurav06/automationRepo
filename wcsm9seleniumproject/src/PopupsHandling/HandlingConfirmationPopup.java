package PopupsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to demo app
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on confirm 
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		//click on confirmation pop up
		driver.findElement(By.id("buttonAlert5")).click();
		
		//switch to control 
		Alert alt = driver.switchTo().alert();
		
		//use getText()
		String text = alt.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		
		//use dismiss
		alt.dismiss();
		
		
		

	}

}
