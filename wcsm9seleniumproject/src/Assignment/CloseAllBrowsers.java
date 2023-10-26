package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Click on open a popup window
		driver.findElement(By.partialLinkText("open a popup window")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
