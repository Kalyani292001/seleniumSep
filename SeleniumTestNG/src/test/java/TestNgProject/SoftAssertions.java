package TestNgProject;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

	
	
	@Test
	public void SofteAssertions() {
	SoftAssert softassert=new SoftAssert();
	String First_Name="Kalyani";
	softassert.assertEquals(First_Name, "Kalyani");
	System.out.println("I am Learning Test Ng Assertion");
	softassert.assertEquals(First_Name, true);
	
	}
}
