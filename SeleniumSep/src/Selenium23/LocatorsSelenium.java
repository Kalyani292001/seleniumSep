package Selenium23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		        // by id
				driver.findElement(By.id("user-name"));
				
				// by className
				driver.findElement(By.className("submit-button"));
				
				// by tagName
				driver.findElement(By.tagName("form"));
				
				// by css selector
				//<input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">
				
				driver.findElement(By.cssSelector(".submit-button"));
				driver.findElement(By.cssSelector("#login-button"));
				driver.findElement(By.cssSelector("form"));
				driver.findElement(By.cssSelector("input[type=\"submit\"]"));

				// by xpath
				driver.findElement(By.xpath("//input[@type = \"submit\"]"));
				
				//by Name
				driver.findElement(By.name("login-button"));
				
				// by partial link text
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.cssSelector("#login-button")).click();
				driver.findElement(By.partialLinkText("Sauce"));
				
				
				// by linkText
				driver.findElement(By.linkText("Sauce Labs Backpack"));
				System.out.println("hello");
				driver.close();

	}
}
