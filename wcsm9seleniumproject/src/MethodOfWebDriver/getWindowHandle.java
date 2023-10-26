package MethodOfWebDriver;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.matcher.ClassLoaderParentMatcher;
public class getWindowHandle {

	public static void main(String[] args, char[] parentHandle) throws InterruptedException {
	@SuppressWarnings("unused")
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2000);
	//take address of current window or browser
	//parent browser
	String parentHandle1 =driver.getWindowHandle();
	System.out.println(parentHandle1);
	
     
     

	}

}