package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDemoShopOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li/a")).click();
		driver.findElement(By.xpath("//a[@Class='ico-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prachip11299@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
		
		//click on book link
		driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
		Thread.sleep(2000);
		
		//click on add to cart button
		driver.findElement(By.xpath("//a[text()='Health Book']/ancestor::div[@class='details']/descendant::input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		
		//print add successfully added into the cart
        String addToCartMsg = driver.findElement(By.xpath("//p[@class='content']")).getText();
		
		
		
		
		//add city
		//driver.findElement(By.name("text-box single-line valid")).sendKeys("Pune");
		//add address
		//driver.findElement(By.id("Street address is required")).sendKeys("BillingNewAddress_Address1");
		//add zip or postal code
		//driver.findElement(By.className("Zip / postal code is required")).sendKeys("411022");
		//add phone number
		//driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9888956232");
		//click on continue button
		
		//chechbox
		//driver.findElement(By.name("checkbox")).click();
		
		
		
		
		
		
		
}

}
