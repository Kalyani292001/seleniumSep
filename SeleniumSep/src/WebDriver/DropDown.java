package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement ele = driver.findElement(By.cssSelector("#dropdowm-menu-1"));

		// create object of select
		Select select = new Select(ele);

		// find by index
		select.selectByIndex(3);

		// find by value
		select.selectByValue("sql");

		// find by visible text(html element)
		select.selectByVisibleText("SQL");

		// Selecting the value from all three drop down
		selectDropDown(driver, 1, "Python");
		selectDropDown(driver, 2, "Maven");
		selectDropDown(driver, 3, "JavaScript");

//		selectDropDown(driver,1,"Python");
//		selectDropDown(driver,2,"Maven");
//		selectDropDown(driver,3,"JavaScript");

		driver.close();

	}


	public static void selectDropDown(WebDriver driver, int i, String visibleText) {
		WebElement ele = driver.findElement(By.cssSelector("#dropdowm-menu-" + i));
		Select select = new Select(ele);
		select.selectByVisibleText(visibleText);

	}
	

	public void selectDropDown(WebDriver driver, int i, int id) {
		WebElement ele = driver.findElement(By.cssSelector("#dropdowm-menu-" + i));
		Select select = new Select(ele);
		select.selectByIndex(id);

	}

	public void selectDropDownValue(WebDriver driver, int i, String value) {
		WebElement ele = driver.findElement(By.cssSelector("#dropdowm-menu-" + i));
		Select select = new Select(ele);
		select.selectByValue(value);

	}

}
