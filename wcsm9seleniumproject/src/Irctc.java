import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
	 ChromeOptions co=new ChromeOptions();
	 co.addArguments("--disable-notification");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN826G0&p=irctc");
	 Thread.sleep(2000);
	 driver.switchTo().activeElement().sendKeys("Pune");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("<script async=\"\" src=\"https://www.googletagmanager.com/gtag/js?id=G-SHTZYKNHG2\"></script>")).click();
	 
	
	
	}

}
