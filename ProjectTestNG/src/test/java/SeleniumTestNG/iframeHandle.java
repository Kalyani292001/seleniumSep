package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframeHandle {
	WebDriver driver;

	//@Test

//	public void iframeSuit() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//
//		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
//		WebElement iframe = driver.findElement(By.cssSelector("#frame"));
//		driver.switchTo().frame(iframe);
//		boolean home = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
//		Assert.assertTrue(home);
//		WebElement iframe = driver.findElement(By.cssSelector("#frame"));
//		driver.switchTo().frame(iframe);
//		boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
//		Assert.assertTrue(avail);
		
		
		@Test
		public void IframeTestCase2() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
			// iFrame by index
			driver.switchTo().frame(0);
			boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
			Assert.assertTrue(avail);
			driver.switchTo().defaultContent();
			System.out.println(driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("IFrame"));
			driver.close();
			
		}
		
		
		@Test
		public void IframeTestCase3() {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
			// iFrame by  id or name
			driver.switchTo().frame("frame");
			boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
			Assert.assertTrue(avail);

	}
}
