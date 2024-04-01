package KerboardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://pagi/login.jsp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//identify user name text-field
		driver.findElement(By.name("Username")).sendKeys("admin",Keys.TAB,"Manager",Keys.ENTER);
		


	}

}
