package MethodOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class CloseMethod1 {

	private static Object thread;
	private static String parentHandles;
	private static Object wh;
	private static Object (wh);


	{
	 }
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http;//omayo.blogspot.com/");
		System.out.println("address of parent browser or window"+parentHandles);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("open a pop up window")).click();
		Set<String>allHandleS1 =driver.getWindowHandles();
		for(String wh:allHandleS1);
		{
			System.out.println("parentHandles:"+wh+"childHandle:"+wh+)
			IF(parentHandles (wh));
			{
			  System.out.println("address of child window:"+wh);
			}
			else {
				
			} {
				
			}
			{
				System.out.println("address of parent window:"+wh);
				}
			}

	}

	private static String IF(Object parentHandles2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object parentHandles(Object wh2) {
		// TODO Auto-generated method stub
		return null;
	}
