package seleniumPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotatios_Test {
	
	
	
/*	xml
	-------
Suite name="mysuite>
	     <test name="mytest1>
	       <classes>
	        <class name="xyz"/>
	       </classes>
	        </test>
	       
	       <classes>
	       <class name="abc"/>
	       </classes>
	      </test>
</Suite>
*/
	@BeforeSuite
	void bs1() {
		System.out.println("This is before suite");
	}
	@BeforeTest
	void bt1() {
		System.out.println("This is before Test");
	}
	@AfterSuite
	void as() {
		System.out.println("This is after suite");
	}
	@AfterTest
	void bt() {
		System.out.println("This is after Test");
	}
	@BeforeClass
	void bc() {
		System.out.println("This is before class");
	}
	@AfterClass
	void ac() {
		System.out.println("This is after class");
	}
	
	@BeforeMethod
	void bm() {
		System.out.println("This is before method");
	}
	
	@AfterMethod
	void am() {
		System.out.println("This is after method");
	}
	
	@Test
	void xyz() {
		System.out.println("This is xyz test");
	}
	@Test
	void abc() {
		System.out.println("This is abc test");
	}
	
}
