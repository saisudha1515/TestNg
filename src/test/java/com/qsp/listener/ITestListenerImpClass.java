package com.qsp.listener;/// pending

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

import ReusableMethodClass.BaseClass;

public class ITestListenerImpClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getName();
		Reporter.log("Testcase started : " + methodName, true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getName();
		Reporter.log("Testcase success : " + methodName, true);
	}

// we need to write the screenShot syntax in onTestFailure() in order to get the failure testcases 
	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();

		Reporter.log(" Testcase failure : " + methodName, true);
		TakesScreenshot sh = (TakesScreenshot) BaseClass.driver; // here we need to call the driver with the help of
																	// class name i.e, BaseClass.. for this we need to
																	// make webdriver as "static" or we can create
																	// object for BaseClass and call the driver by using
																	// BaseClass referance variable...
		File source = sh.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Automation_Selenium\\FailureTetsCasesScreenShots\\" + methodName + ".png");
		try {
			Files.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getName();
		Reporter.log("Testcase skipped : " + methodName, true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Project started", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Project finished", true);
	}

}
