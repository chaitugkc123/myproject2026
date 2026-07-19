package seleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
	
	@Test
	
	void LogoTest() {
		 String expected="OrangeHRM";
		 String actual="OrangeHRM";
		 
		 Assert.assertEquals("OrangeHRM", "OrangeHRM");//passed
		 Assert.assertTrue("OrangeHRM"=="OrangeHRM");//passed
		// Assert.assertEquals("abc", 123);
		 
		 //---we need to use soft assert inorder to execute below code without termination, 
		 //---when we execute test case it will get passed so which is ot correct so use assertAll at end of test case mandatoraly
		 
		 SoftAssert sa = new SoftAssert();
		
		 sa.assertEquals(123, 345);;
		 sa.assertFalse("OrangeHRM"=="OrangeHRM");//pass
		 sa.assertAll();
	}

}
