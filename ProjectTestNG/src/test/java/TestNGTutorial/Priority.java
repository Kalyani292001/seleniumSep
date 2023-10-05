package TestNGTutorial;

import org.testng.annotations.Test;

public class Priority {

	
	@Test (priority=3)
	public void alpha() {
		System.out.println("test case of alpha");
	}
	
	@Test(priority=1)
	public void beta() {
		System.out.println("test case of beta");
	}

	
	@Test(priority=2)
	public void gamma() {
		System.out.println("test case of gamma");
	}
	
	@Test(priority=-1)
	public void MinusTest() {
		System.out.println("test case of MinusTest");
	}
	

}
