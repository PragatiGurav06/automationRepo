package PopupsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedPopUpByUsingSendkeysMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to demo app
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\abhil\\Downloads\\Certificate_pragatigurav6829@gmail.com.pdf");

	}

}
