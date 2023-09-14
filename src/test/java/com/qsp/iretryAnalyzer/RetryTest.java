package com.qsp.iretryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {
	int count = 0;
	int maxTry = 3;

	@Override
	public boolean retry(ITestResult result) { // maximum the testcase got executed for 3 times..
		if (count < maxTry) { // write simple java logic
			System.out.println(result.getName());
			count++;
		}
		return true;
	}
}
