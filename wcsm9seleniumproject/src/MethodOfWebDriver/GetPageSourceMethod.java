package MethodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import com.beust.jcommander.Strings;

public class GetPageSourceMethod {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		//take url of login page
		
		String urlOfLoginPage=driver.getCurrentUrl();
		System.out.println(urlOfLoginPage);
		Thread.sleep(2000);
		driver.close();
		
	}

}
   