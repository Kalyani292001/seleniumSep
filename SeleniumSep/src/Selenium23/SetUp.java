package Selenium23;

import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
//	ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/in/kalyani-hadole-49620422a/");
	}

}
