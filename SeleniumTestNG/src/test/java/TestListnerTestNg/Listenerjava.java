package TestListnerTestNg;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerjava implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Staring -----");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Ending -----");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed-------");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped -------");
	}

}
