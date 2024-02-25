package TestNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotationD3 {

	@BeforeSuite

	public void beforeSuit() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest

	public void beforeTest() {
		System.out.println("Before test");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("before Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}
	

	@Test

	public void testOne() {
		System.out.println("Test Case One");
	}

	@Test

	public void testTwo() {
		System.out.println("Test Case Two");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
}
