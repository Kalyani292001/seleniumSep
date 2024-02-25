package PagesSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	private WebDriver driver;

	// constructor for set the driver
	public Login(WebDriver driver) {
		this.driver = driver;
	}

	By UserName = By.id("user-name");
	By PassWord = By.id("password");
	By LoginClick = By.id("login-button");
	By errorMessage = By.tagName("h3");

	public void enterUserName(String username) {
		driver.findElement(UserName).sendKeys(username);
	}

	
	public void enterPassWord(String password) {
		driver.findElement(PassWord).sendKeys(password);
	}

	public void ClickAction() {
		driver.findElement(LoginClick).click();
	}

	public void loginActions(String username, String password) {
		enterUserName(username);
		enterPassWord(password);
		ClickAction();
	}
	
	public boolean errorMessage() {
		return driver.findElement(errorMessage).isDisplayed();
	}



	

	

}
