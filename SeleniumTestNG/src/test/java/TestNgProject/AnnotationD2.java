package TestNgProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationD2 {
	ChromeDriver driver;

	@BeforeMethod
	public void SetBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
	}

	@Test(priority = 1, enabled = false) // we can use enable for skip the test
	public void TestCaseOne() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "WebDriverUniversity.com");
	}

	@Test(priority = 2)
	public void TestCaseTwo() {
		boolean url = driver.getCurrentUrl().contains("university");
		Assert.assertTrue(url);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
