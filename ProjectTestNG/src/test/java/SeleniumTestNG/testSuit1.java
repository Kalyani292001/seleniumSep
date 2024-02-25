package SeleniumTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSuit1 {
	WebDriver driver;

	@Test

	public void TetsSuitOne() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\hello\\\\Downloads\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");

		WebElement Text = driver.findElement(By.id("myInput"));
		Text.sendKeys("P");
		List<WebElement> List = driver.findElements(By.cssSelector("#myInputautocomplete-list>div"));

//		for (int i = 0; i < List.size(); i++) {
//			String getText = List.get(i).getText();
//			if (getText.equals("Pepperoni")) {
//				List.get(i).click();
//				break;
//			}
//		}
		
		for(int i=0;i<List.size();i++) {
			String text=List.get(i).getText();
			if(text.equals("Pepperoni")) {
				List.get(i).click();
				break;
			}
		}
		driver.findElement(By.cssSelector("#submit-button")).click();
		String url = driver.getCurrentUrl();
		boolean contain = url.contains("food-item=Pepperoni");
		Assert.assertTrue(contain);

		// WebElement inputText = driver.findElement(By.id("myInput"));
//		inputText.sendKeys("P");
//
//		List<WebElement> Text = driver.findElements(By.cssSelector("#myInputautocomplete-list > div"));
//		for (int i = 0; i < Text.size(); i++) {
//			System.out.println(i);
//			String getText = Text.get(i).getText();
//			if (getText.equals("Pepperoni")) {
//				Text.get(i).click();
//				break;
//			}
//		}
//
		
//		driver.findElement(By.id("submit-button")).click();
//		String Url = driver.getCurrentUrl();
//		boolean TextContain = Url.contains("food-item=Pepperoni");
//		Assert.assertTrue(TextContain);
		driver.close();

	}

	@Test
	public void ArrowActions() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\hello\\\\Downloads\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");

		WebElement inputText = driver.findElement(By.id("myInput"));
		inputText.sendKeys("P");

//		inputText.sendKeys(Keys.ARROW_DOWN);
//		inputText.sendKeys(Keys.ENTER);
		inputText.sendKeys(Keys.ARROW_DOWN);
		inputText.sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit-button")).click();
		String Url = driver.getCurrentUrl();
		boolean TextContain = Url.contains("food-item=Pizza");
		Assert.assertTrue(TextContain);
		driver.close();

	}

}
