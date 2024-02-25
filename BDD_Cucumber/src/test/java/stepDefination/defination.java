package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class defination {
	public WebDriver driver;
	public LoginPage login;

	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		login = new LoginPage(driver);

	}

	@Given("Open the Orangehrm demo URL")
	public void open_the_orangehrm_demo_url(String url) {
		driver.get(url);

	}

	@Then("Fill the user-name")
	public void fill_the_user_name(String username) {
		login.setUserName(username);
	}

	@Then("Fill the password")
	public void fill_the_password(String password) {
		login.enterPassWord(password);
	}

	@Then("Click on login button")
	public void click_on_login_button() {
		login.LoginBtn();
	}

	@When("Validate the sucessfull msg")
	public void validate_the_sucessfull_msg(String msg) {
		login.SuccesFullMSG(msg);
	}
}
