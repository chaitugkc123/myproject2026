package seleniumPractice;

import org.testng.annotations.Test;

/*1)open app
2)login 
3)Logout*/
public class FirstTestCase {
	@Test(priority=1)
	void openapp() {
		System.out.println("opening Application");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Login to Application");
	}
	@Test(priority=3)
	void logot() {
		System.out.println("Logout from Application");
		}

}




