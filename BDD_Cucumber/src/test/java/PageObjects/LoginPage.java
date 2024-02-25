package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	By UserName = By.cssSelector("name=\"username\"");
	By PassWord = By.cssSelector("type=\"password\"");
	By LoginBtn = By.cssSelector("type=\"submit\"");
	By SuccesfullMsg = By.cssSelector("[class=\"oxd-brand-banner\"]");

	public void setUserName(String uname) {
		driver.findElement(UserName).sendKeys(uname);
	}

	public void enterPassWord(String password) {
		driver.findElement(PassWord).sendKeys(password);
	}

	public void LoginBtn() {
		driver.findElement(LoginBtn).click();
	}

	public void loginActions(String username, String password) {
		setUserName(username);
		enterPassWord(password);
		LoginBtn();

	}

	public boolean SuccesFullMSG(String msg) {
		 boolean visible = driver.findElement(SuccesfullMsg).isDisplayed();
		System.out.println(visible);
		return visible;
	}
}
