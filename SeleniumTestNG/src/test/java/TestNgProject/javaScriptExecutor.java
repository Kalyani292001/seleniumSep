package TestNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class javaScriptExecutor {
	WebDriver driver;

	@BeforeMethod
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
	}

	@Test(enabled = false)
	public void TestCase() {
		WebElement ele = driver.findElement(By.id("contact-us"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", ele);
		driver.quit();
	}

	@Test(enabled = false)

	public void TestCaseTwo() {
		WebElement ele = driver.findElement(By.id("popup-alerts"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		driver.quit();
	}

	@Test(enabled = false)
	public void TestCaseThree() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String) js.executeScript("return document.title");

		if (title.equals("WebDriverUniversity.com")) {
			System.out.println("test case pass for title");
		} else {
			System.out.println("test case fail for title");
		}
		driver.quit();
	}

	@Test
	public void TestCaseFour() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String) js.executeScript("return window.location.href");

		if (title.equals("https://webdriveruniversity.com/")) {
			System.out.println("test case pass for href");
		} else {
			System.out.println("test case fail for href");
		}
		driver.quit();
	}
}

// for title===> return document.title (String)
// for url===> return window.location.href(String)
// for scrollIntoView===> argument[0].scrollIntoView(true)
// for click actions ===> argument[0].click()
