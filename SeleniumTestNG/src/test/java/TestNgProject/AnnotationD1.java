package TestNgProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationD1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before method");
	}

	@Test
	public void TestOne() {
		System.out.println("test case one");
	}

	@Test
	public void TestTwo() {
		System.out.println("test case Two");
	}

	@AfterMethod
	public void Aftermethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterClas() {
		System.out.println("after class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

	@AfterSuite

	public void afterSuite() {
		System.out.println("after suite");
	}

}
