package seleniumPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Before executing for each test case");
	  }
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("Executing for success test case");
	 }
		 public void onTestFailure(ITestResult result) {
			 System.out.println("Executing for Failure test case");
			  }
		 public void onTestSkipped(ITestResult result) {
			 System.out.println("Executing for skipped test case");
			  }
		 public void onStart(ITestContext context) {
			 System.out.println("Executing before all test case");
			  }

}
