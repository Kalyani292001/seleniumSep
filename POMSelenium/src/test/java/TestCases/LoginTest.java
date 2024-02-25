package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PagesSelector.Login;
import Utilities.Utils;

public class LoginTest {
	WebDriver driver;
	Login login;
	Utils Utilities;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		login = new Login(driver);
		Utilities = new Utils(driver);
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void valideCredentials() {
		login.loginActions("problem_user", "secret_sauce");
		login.ClickAction();
		boolean currentUrl = Utilities.validation("inventory");// validation("inventory");
		Assert.assertTrue(currentUrl);
	}

	@Test
	public void InvalideCredentials() {
		login.loginActions("problem", "st_sauce");
		login.ClickAction();
		boolean currentUrl = Utilities.validation("inventory");
		Assert.assertTrue(currentUrl);
	}

	@AfterMethod
	public void closeBroswer() {
		driver.quit();
	}

}
