package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mouseActions {
	WebDriver driver;
	Actions action;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		action = new Actions(driver);
	}

	@Test
	public void drapAndDrop() {

		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).build().perform();
		Assert.assertEquals(drop.getText(), "Dropped!");

	}

	@Test
	public void doubleClick() {

		WebElement doubleClick = driver.findElement(By.id("double-click"));

		action.doubleClick(doubleClick).build().perform();
		String addAtt = doubleClick.getAttribute("class");
		Assert.assertEquals(addAtt, "div-double-click double");
	}
	
	@Test
	public void clickAndHold() {

		WebElement clickAndHold = driver.findElement(By.id("click-box"));
		action.clickAndHold(clickAndHold).build().perform();
		Assert.assertEquals(clickAndHold.getText(), "Well done! keep holding that click now.....");
		
	}
	

	@Test
	public void hover() {

		WebElement hover = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
		action.moveToElement(hover).build().perform();
		boolean visible=driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a")).isDisplayed();
		Assert.assertTrue(visible);
		
	}
	
	@Test
	public void rightClick() {

		WebElement contextClick = driver.findElement(By.id("double-click"));
		action.contextClick(contextClick).build().perform();
		
	}
	
	@AfterMethod
	public void browserClose() {
		driver.close();
	}

}
