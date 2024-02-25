package TestNGTutorial;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paraMeters {
	WebDriver driver;

	@Parameters({ "username", "password" })
	@Test()
	public void usingXML(String un, String pw) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.id("login-button")).click();
		boolean currUrl = driver.getCurrentUrl().contains("inventory.html");
		Assert.assertTrue(currUrl);
		driver.close();
	}
}
