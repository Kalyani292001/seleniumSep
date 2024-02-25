package TestNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterD1 {
	WebDriver driver;

	@Test
	@Parameters({ "url", "email" })

	public void YahooLogin(String url, String email) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id=\"login-signin\"]")).click();
	}
}
