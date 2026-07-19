package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(seleniumPractice.TestNgListeners.class)
public class OrangeHrmTest {
	WebDriver driver;
	/*1)open application
	2)test logo presence
	3)login
4)close*/

	@Test(priority=1)
	void openapp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Launched url successfully");
	}
	
	@Test(priority=2)
	public void testLogo() {
	boolean b=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("logo displayed:"+b);
	}
	@Test(priority=3)
	public void login() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Logged in successfully");
	}
	@Test(priority=4)
	void logout() {
		driver.quit();
		}
	
	
}
