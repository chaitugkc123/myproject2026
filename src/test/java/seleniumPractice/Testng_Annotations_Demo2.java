package seleniumPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng_Annotations_Demo2 {
	
	@BeforeClass
	void Login(){
		System.out.println("Login into application");
	}
	@Test
	void Search() {
		System.out.println("Search functionality");
	}
	@Test
	void AdvancedSearch() {
		System.out.println("Advancedsearch functionality");
	}
	
	@AfterClass
	void Logout() {
		System.out.println("Logout into Application");
	}

}
