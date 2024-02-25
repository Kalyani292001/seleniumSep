package Selenium23;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.multipart.FileUpload;

public class ScreenShot {
	public static void main(String[]arg) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hello\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https:www.facebook.com");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("C:\\Users\\hello\\eclipse-workspace\\SeleniumSep\\src\\Selenium23\\Fb.jpeg");
	}
}
