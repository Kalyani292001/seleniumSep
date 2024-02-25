package Utilities;

import org.openqa.selenium.WebDriver;

public class Utils {

	WebDriver driver;
	 public Utils(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 public boolean validation(String url) { 
		 return this.driver.getCurrentUrl().contains(url);
	 }
}
