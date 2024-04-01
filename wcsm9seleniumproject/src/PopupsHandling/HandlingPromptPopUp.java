package PopupsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopUp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to demo app
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on prompt pop up
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		
		//click on prompt button
		driver.findElement(By.id("buttonAlert1")).click();
		
		//switch to control
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		//pass the value inside prompt popup
		alt.sendKeys("yes");
		
		Thread.sleep(2000);
		
		//click on OK
		alt.accept();


	}

}
