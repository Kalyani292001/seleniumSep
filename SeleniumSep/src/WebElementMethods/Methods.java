package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// <h1 id = "one" class ="two">HeadOne<h1>
		// getText()
		WebElement ele = driver.findElement(By.cssSelector("h1"));
		String actual = ele.getText();
		String expected = "Dropdown Menu(s), Checkboxe(s) & Radio Button(s)";
		if (actual.equals(expected)) {
			System.out.println("testcase pass");
		} else {
			System.out.println("testcase fail");
		}

		// isDisplayed()
		if (ele.isDisplayed()) {
			System.out.println("test case2 pass");
		} else {
			System.out.println("test case 2 fail");
		}

		// isSelected() // click()

		WebElement ele2 = driver.findElement(By.cssSelector("input[value=\"green\"]"));
		ele2.click();
		if (ele2.isSelected()) {
			System.out.println("test case 3 pass");
		} else {
			System.out.println("test case 3 fail");
		}

		// isEnabled()

		WebElement ele3 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]"));
		if (ele3.isEnabled()) {
			System.out.println("testcase 4 pass");
		} else {
			System.out.println("test case 4 fail ");
		}

		// getSize();

		WebElement ele4 = driver.findElement(By.cssSelector("div[class=\"thumbnail\"]"));
		Dimension heightWeight = ele4.getSize();
		driver.manage().window().maximize();
		System.out.println(heightWeight);
		System.out.println(ele.getSize());

		// getAttribute()

		WebElement ele5 = driver.findElement(By.id("main-header"));
		String classValue = ele5.getAttribute("class");
		System.out.println(classValue);

		// getCssValue()
		String fontSizeValue = ele.getCssValue("font-size");
		System.out.println(fontSizeValue);

		// getTagName()

		String tg = ele.getTagName();
		System.out.println(tg);
	}

}
