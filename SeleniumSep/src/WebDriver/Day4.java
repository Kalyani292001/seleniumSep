package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement result = driver.findElement(By.id("result"));
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
//		driver.switchTo().alert().accept();
//		if(result.getText().equals("You successfully clicked an alert")) {
//			System.out.println("testcase pass ");
//		}
//		else {
//			System.out.println("Test case fail");
//		}

		// test case 2

//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
//		driver.switchTo().alert().accept();
//		if (result.getText().equals("You clicked: Ok")) {
//			System.out.println("Testcase pass ");
//		} else {
//			System.out.println("Test case fail");
//		}
		
		// Test case 3
		
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
//		driver.switchTo().alert().dismiss();
//		if (result.getText().equals("You clicked: Cancel")) {
//			System.out.println("Testcase pass ");
//		} else {
//			System.out.println("Test case fail");
//		}
		
		// Test case 4
		
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
//		String  n  = "hello";
//		driver.switchTo().alert().sendKeys(n);
//		driver.switchTo().alert().accept();
//		if(result.getText().contains(n)) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
		
		// Testcase 5
		
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
//		driver.switchTo().alert().dismiss();
//		if(result.getText().contains("null")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//		
		
		
	}

}
