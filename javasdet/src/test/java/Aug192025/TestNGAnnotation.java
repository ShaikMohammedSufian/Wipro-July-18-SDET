package Aug192025;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	//STCM-suite,test,class,method this is order of execution
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test checking products");
	}

 
	@AfterTest
	public void aftertest() {
		System.out.println("after test removing products");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class Opening the api connections");
	}

 
	@AfterClass
	public void afterclass() {
		System.out.println("after class closing the api connections");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite Opening the db connections");
	}

 
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite closing the db connections");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method Launch browser");
	}

 
	@AfterMethod
	public void aftemethod() {
		System.out.println("after method closing the browser");
	}
	@Test
	public void testcase1() {
 
		System.out.println("Test Testcase1 is executed");
	}
 
	@Test
	public void testcase2() {
 
		System.out.println("Test Testcase2 is executed");
 
	}
 
	@Test
	public void testcase3() {
 
		System.out.println("Test Testcase3 is executed");
 
	}	
}
