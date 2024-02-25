package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	
	WebDriver driver=new ChromeDriver();
	

//	public void SetUp() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
//		//WebDriver driver=new ChromeDriver();
//	}

	@Given("visit the url")
	public void visit_the_url() {
	    // Write code here that turns the phrase above into concrete actions
driver.get("https://www.google.com/");
	}

	@When("click on search bar and enters {string}")
	public void click_on_search_bar_and_enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Search= driver.findElement(By.cssSelector("[class=YacQv]"));
		Search.sendKeys(string);
		Search.click();
	}

	@Then("Show the all result related to the selenium")
	public void show_the_all_result_related_to_the_selenium() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement result=driver.findElement(By.cssSelector("[class=\"uhHOwf BYbUcd\"]>img[style=\"margin-left:-7px;width:168px\"]"));
		boolean re=result.isDisplayed();
		if(re) {
			System.out.println("test case pass");
		}else {
			System.out.println("test case fail");
		}
	}


}
