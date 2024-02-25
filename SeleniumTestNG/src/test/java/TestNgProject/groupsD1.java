package TestNgProject;

import org.testng.annotations.Test;

public class groupsD1 {
	
	@Test(groups="login")
	public void testCaseOne() {
		System.out.println("test case one");
	}
	
	@Test
	public void testCaseTwo() {
		System.out.println("test case two");
	}

	
	@Test(groups = "login")
	public void testCaseThree() {
		System.out.println("test case Three");
	}

	
	@Test
	public void testCaseFour() {
		System.out.println("test case Four");
	}

	
	@Test(groups = "login")
	public void testCaseFive() {
		System.out.println("test case Five");
	}


}
