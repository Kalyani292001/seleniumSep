package CommonsClass;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.Utils;

public class ListenersTest extends Utils implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Staring -----");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Ending -----");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed-------");
		getScreenShot();
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped -------");
	}
}
