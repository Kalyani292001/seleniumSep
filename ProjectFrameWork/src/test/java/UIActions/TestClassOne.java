package UIActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonsClass.BaseClass;

public class TestClassOne extends BaseClass {

	@Test(enabled = false)
	public void ScreenShotTest() {
		driver.get("https://www.google.com");
		Assert.assertEquals("kalyanii", "Kalyani");
	}

	@Test
	public void FileUpload() {

		driver.get("https://webdriveruniversity.com/File-Upload/index.html?filename=Unit.pdf");
		String path = "C:\\Users\\hello\\eclipse-workspace\\ProjectFrameWork\\src\\test\\java\\Files\\Employer Agreement_Edit.pdf";
		WebElement chooseFile = driver.findElement(By.id("myFile"));
		chooseFile.sendKeys(path);

		driver.findElement(By.id("submit-button")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals("Your file has now been uploaded!", text);
	}

}
