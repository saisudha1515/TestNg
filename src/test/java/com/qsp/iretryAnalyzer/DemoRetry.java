package com.qsp.iretryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoRetry {
	@Test(retryAnalyzer = com.qsp.iretryAnalyzer.RetryTest.class) // here ewe need to add one flag called retryAnalyzer
	public void m1() { // System.out.println(); will applicable only inside the main method..
		System.out.println("Hello");
		Assert.fail(); // i am failing my testcase so this test case will run for maximun retry count i.e, 3
	}
}
