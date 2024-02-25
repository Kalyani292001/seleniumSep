package TestNgProject;

import org.testng.annotations.Test;

public class TestCaseOne {

	@Test
	public void testOne() {
		System.out.println("Test Case One"); 
	}
	

	@Test
	public void testTwo() {
		System.out.println("Test Case Two"); 
	}

	@Test
	public void testThree() {
		System.out.println("Test Case Three"); 
	}
	

	@Test(enabled = false)
	public void testFour() {
		System.out.println("Test Case Four"); 
	}
	
}
