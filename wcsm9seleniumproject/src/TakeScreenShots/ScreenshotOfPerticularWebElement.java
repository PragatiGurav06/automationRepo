package TakeScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenshotOfPerticularWebElement {

	private static WebElement goldCoin;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		//handle popup
		driver.findElement(By.id("confirmBtn")).click();
	    WebElement goldCoin = driver.findElement(By.xpath("//li[@id='goldCoins']"));
		//use actions class
		Actions act = new Actions(driver);
		
		//use move to Element
		act.moveToElement(goldCoin).perform();
		
		//click on gold coin
		goldCoin.click();
		//identify the gold coin
		WebElement coin = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
		File src = coin.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Coin.png");
		Files.copy(src, dest);
		
	
		
		
				
	
	}

}
