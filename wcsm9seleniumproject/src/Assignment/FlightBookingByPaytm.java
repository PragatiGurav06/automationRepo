package Assignment;

import java.awt.RenderingHints.Key;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBookingByPaytm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("paytm",Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay ...']")).click();
		 
		//Scroll till book & buy on Paytm
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
		driver.findElement(By.id("from")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.className("_1X2Sn")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
		//to enter del in texfield
		driver.findElement(By.id("To")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.className("_1X2Sn")).sendKeys("del");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
		
		//click on departure date
		driver.findElement(By.id("Departure Date")).click();
		driver.findElement(By.xpath("")).click();
		
		//search flights
		driver.findElement(By.id("Search Flights")).click();
		Thread.sleep(2000);
		
		//seArch fight prize of first flight
		driver.findElement(By.xpath("(//span[text()='View fare']/ancestor::div[@class=''")).click();
		
		
		
		
		
		

		
	}

}
