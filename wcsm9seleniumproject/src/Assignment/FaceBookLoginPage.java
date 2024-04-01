package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=449838951736891&kid_directed_site=0&app_id=449838951736891&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.12%2Fdialog%2Foauth%3Fresponse_type%3Dcode%26client_id%3D449838951736891%26redirect_uri%3Dhttps%253A%252F%252Fauth.opera.com%252Faccount%252Fsocial%252Fv4%252Fcallback%26scope%3Demail%26state%3DaoWJkNGjpy1AivtsYP7vOjd6fyZ6Lr%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3Dc39f90cf-7f72-4055-af69-3fa914c546c5%26tp%3Dunspecified&cancel_url=https%3A%2F%2Fauth.opera.com%2Faccount%2Fsocial%2Fv4%2Fcallback%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3DaoWJkNGjpy1AivtsYP7vOjd6fyZ6Lr%23_%3D_&display=page&locale=en_GB&pl_dbl=0");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Vedika");
		driver.findElement(By.name("lastname")).sendKeys("Varma");
		Thread.sleep(2000);
		
		//Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("8307078200");
		driver.findElement(By.id("password_step_input")).sendKeys("Vedu@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("Female")).click();		
		//driver.findElement(By.className("Sign Up")).click();
		driver.findElement(By.linkText("Already have an account?")).click();
		
	}

}
