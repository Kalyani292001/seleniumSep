package TestCase;

import org.testng.ITestListener;

import PagesSelector.BaseClass;

public class ListenersTestNg extends BaseClass implements ITestListener{
	
	public void OnTestStart(String result) {
		System.out.println("Test Case start");
	}
	
	public void OnTestEnd(String result) {
		System.out.println("Test Case End");
	}

	public void OnTestFailure(String result) {
		System.out.println("Test Case Failed");
	}

	public void OnTestSucess(String result) {
		System.out.println("Test Case Pass For Valid Credentials");
	}
}
