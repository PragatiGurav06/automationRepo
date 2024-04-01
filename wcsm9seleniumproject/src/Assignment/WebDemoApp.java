package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDemoApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li/a")).click();
		driver.findElement(By.xpath("//a[@Class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prachi11299@gamil.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Prags@123");
		driver.findElement(By.name("checkbox")).click();
		driver.findElement(By.name("")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		
		}

}
