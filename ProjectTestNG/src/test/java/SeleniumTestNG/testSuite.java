package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSuite {
	@Test
	// program 1
	public void testSuitOne() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement ele = driver.findElement(By.cssSelector("#contact-us"));
		ele.click();
		driver.close();
	}

	// program 2
	// click()
	@Test
	public void testSuitTwo() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement ele = driver.findElement(By.cssSelector("#contact-us"));
		String clickAction = "arguments[0].click()";
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(clickAction, ele);
		driver.close();
	}

	// program 3
	// scrollIntoView()
	@Test
	public void testSuitThree() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement ele = driver.findElement(By.cssSelector("#scrolling-around"));
		String scrollAtions = "arguments[0].scrollIntoView(true)";
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(scrollAtions, ele);
		// driver.close();
	}

	// program 4
	// setAttribute()
	@Test
	public void testSuitFour() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement ele = driver.findElement(By.cssSelector("#scrolling-around"));
		String setAtrr = "arguments[0].setAttribute('data_set','scroll_view')";
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(setAtrr, ele);
		String newAtrr = ele.getAttribute("data_set");
		Assert.assertEquals(newAtrr, "scroll_view");
		// driver.close();
	}

	
	
	// program 5
	// verify title
	@Test
	public void testSuitFive() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.webdriveruniversity.com/");
//		String title=driver.getTitle();
//		Assert.assertEquals(title, "WebDriverUniversity.com");

		String title = "return document.title";
		JavascriptExecutor je = (JavascriptExecutor) driver;
		String actualTitle = (String) je.executeScript(title);
		Assert.assertEquals(actualTitle, "WebDriverUniversity.com");
		driver.close();

	}
}
