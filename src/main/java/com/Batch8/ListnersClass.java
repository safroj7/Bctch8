package com.Batch8;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass implements ITestListener {

	
	  public void onTestFailure(ITestResult result) {
			System.out.println("On test failed");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("On test start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test failed");
	}

	
	public void onFinish(ITestContext context) {
		System.out.println("on Finish");
	}

	
}
