package TestNgProject;

import org.testng.annotations.Test;

public class groupsD2 {

	@Test(groups = { "regression" })
	public void testCaseSix() {
		System.out.println("test case six");
	}

	@Test(groups = "login")
	public void testCaseSeven() {
		System.out.println("test case Seven");
	}

	@Test(groups = { "regression" })
	public void testCaseEight() {
		System.out.println("test case Eight");
	}

}
