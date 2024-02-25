package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		// WebDriver --- interface ---->  implements ChromeDriver
		
		// get()
		//driver.get("http://www.webdriveruniversity.com/");
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String url = driver.getCurrentUrl();
		if(url.contains("inventory")) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test Case Fail");
		}
		
		// findElement 
		WebElement e = driver.findElement(By.cssSelector(".login_logo"));
		
		// findElements
		List<WebElement> eles = driver.findElements(By.cssSelector("input"));
		
		// getTitle()
		
//		String title = driver.getTitle();
//		if(title.equals("Swag Labs")) {
//			System.out.println("TestCase pass");
//		}
//		else {
//			System.out.println("TestCase fail");
//		}
	}

}
