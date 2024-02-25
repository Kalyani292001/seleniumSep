package TestNgProject;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 1)
	public void testOne() {
		System.out.println("Test case one");
	}

	@Test(priority = 2)
	public void testTwo() {
		System.out.println("Test case Two");
	}

	@Test(priority = 0)
	public void testThree() {
		System.out.println("Test case Three");
	}

	@Test(priority = -1)
	public void testFour() {
		System.out.println("Test case Four");
	}
}
