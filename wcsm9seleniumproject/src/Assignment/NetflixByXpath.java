package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixByXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='signIn']")).click();
        //driver.findElement(By.xpath("//label[text()='Email or phone number']")).sendKeys("8788727150");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Piya@123");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

}
