package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.protobuf.Duration;

public class DataProviderDemo {
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		Thread.sleep(1000);
	}

	@Test(dataProvider="dp")
	void testLogin(String email,String pwd) {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		boolean status=driver.findElement(By.xpath("//span[normalize-space()='My Account']")).isDisplayed();
		
		if(status=true) {
			driver.findElement(By.xpath("//span[normalize-space()='Checkout']")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="dp",indices= {0,2,3})
	
	 Object[][] loginData() {
		
		Object data[][]={
		{"abc@gmail.com","test@123"},
		{"xyz@gmail.com","test012"},
		{"john@gmail.com","test@123"},
		{"pavanol123@gmail.com","test@123"}
		
	};
	return data;
}
}
