package Assignment;

import java.time.Duration;

import org.asynchttpclient.netty.request.NettyRequestSender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeByXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://pagi/login.jsp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("username")).sendKeys("maneger");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("06");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[9]")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Neeta");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("Password");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Neeta");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9786543219");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ved");
		driver.findElement(By.xpath("//input[contains(@value,'Create User')]")).click();
		
		
  
	}

}
