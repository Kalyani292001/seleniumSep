package TestListnerTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {
	@Test
	public void testOne() {
		System.out.println("test case one");
		Assert.assertTrue(false);
	}

	@Test
	public void testTwo() {
		System.out.println("Test case two");
		Assert.assertEquals(false, true);
	}
}
