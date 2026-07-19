package seleniumPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Test1
 * 1)Login--@BeforeMethod
 * 2)SearchTest--@Test
 * 3)Logout--@AfterMethod
 * 
 * 1)Login--@BeforeMethod
 * 2)AdvancedTest--@Test
 * 3)Logout--@AfterMethod
 * 
 * Test2
 * 1)Login--@BeforeClass
 * 2)SearchTest--@Test
 * 3)AdvancedTest--@Test
 * 4)Logout--@AfterClass
 */

public class Testng_Annotations_Demo {
	
	@BeforeMethod
	void Login(){
		System.out.println("Login into application");
	}
	@Test
	void Search() {
		System.out.println("Search functionality");
	}
	@Test
	void AdvancedSearch() {
		System.out.println("Search functionality");
	}
	
	@AfterMethod
	void Logout() {
		System.out.println("Logout into Application");
	}

}
