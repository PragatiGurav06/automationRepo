package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.Either;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Explicit type casting 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 //use executeSript () method
		 for(int i=0;i<=2;i++)
		 {
			 js.executeScript("Window.scrollby(0,1000);");
			 Thread.sleep(2000);
		 }
          js.executeScript("Window.scrollby(0,-1000);");
	}

}
