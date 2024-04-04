package PopupsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopUpByUsingRobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to demo app
		driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		 Robot r = new Robot();
		 //for press
		 r.keyPress(KeyEvent.VK_A);
		 r.keyPress(KeyEvent.VK_D);
		 r.keyPress(KeyEvent.VK_M);
		 r.keyPress(KeyEvent.VK_I);
		 r.keyPress(KeyEvent.VK_N);
		 
		 
		 //for relising
		 r.keyRelease(KeyEvent.VK_A);
		 r.keyRelease(KeyEvent.VK_D);
		 r.keyRelease(KeyEvent.VK_M);
		 r.keyRelease(KeyEvent.VK_I);
		 r.keyRelease(KeyEvent.VK_N);
		 
		 //press tab
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 
		 //for press
		 r.keyPress(KeyEvent.VK_A);
		 r.keyPress(KeyEvent.VK_D);
		 r.keyPress(KeyEvent.VK_M);
		 r.keyPress(KeyEvent.VK_I);
		 r.keyPress(KeyEvent.VK_N);
		 
		 //for release
		 r.keyRelease(KeyEvent.VK_A);
		 r.keyRelease(KeyEvent.VK_D);
		 r.keyRelease(KeyEvent.VK_M);
		 r.keyRelease(KeyEvent.VK_I);
		 r.keyRelease(KeyEvent.VK_N);
		 
		 //press tab
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);

		 //press enter
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		}

}
