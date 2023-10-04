package TestNGTutorial;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic {

	@Test

	public void BasicOne() {
		System.out.println("Sonali");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.13.0");
		
	}

}
