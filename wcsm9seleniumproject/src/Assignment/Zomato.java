package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to demo app
		driver.get("https://www.zomato.com/india");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//scroll till perticular web element and open linkedin
		driver.findElement(By.xpath("//div[@class='sc-elhb8j-7 jBOGYb'][1]")).click();
		Thread.sleep(2000);
		//Open Instgram page
		driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo'][2]")).click();
		Thread.sleep(2000);
		//Open twitter 
		driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo'][3]")).click();
		Thread.sleep(2000);
		//Open you tube
		driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo'][4]")).click();
		Thread.sleep(2000);
		//OPen Facebook
		driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo'][5]")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		for(String id:allWindowId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Zomato | LinkedIn"))
			{
				System.out.println(driver.getTitle());
			}
			else
			{
				driver.close();
			}
		}
  }

}
