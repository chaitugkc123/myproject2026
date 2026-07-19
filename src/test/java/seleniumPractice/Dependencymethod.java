package seleniumPractice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencymethod {
	
	/*
	 * Open App
	 * Login app
	 * search app
	 * Advanced search app
	 * close app
	 */

	@Test(priority=1)
	void openApp() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,groups= {"Sanity","regression","functional"})
	void login() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=3)
	void search() {
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,dependsOnMethods= {"search","login"},groups= {"regression"})
	void advancedSearch() {
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=5,dependsOnMethods= {"login"},groups= {"Sanity","regression","functional"})
	void logout() {
		Assert.assertTrue(true);
	}	
}
