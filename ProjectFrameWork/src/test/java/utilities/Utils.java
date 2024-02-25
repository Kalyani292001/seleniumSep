package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import CommonsClass.BaseClass;

public class Utils extends BaseClass {

	@Test
	public void getScreenShot() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\hello\\eclipse-workspace\\ProjectFrameWork\\src\\test\\java\\ScreenShots\\Google.png");

		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
