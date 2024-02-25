package TestNgListener;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class ScreenShotTest extends Base{

	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void closeBroweser() {
		driver.quit();
	}
	
	@Test
	public void takeScreenShotOne() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenShotTwo() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenShotThree() {
		Assert.assertEquals(false, true);
	}
}
