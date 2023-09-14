package com.qsp.annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void jdbcConnect() {
		Reporter.log("JDBC is connected", true);
	}

	@BeforeTest
	public void extraConnectios() {
		Reporter.log("Extra connections are connected", true);
	}

	@BeforeClass
	public void openApp() {
		Reporter.log("App is opened ", true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("Login done successfully", true);
	}

	@Test
	public void testCase1() {
		Reporter.log("Testcase1 is passed successfully", true);
	}

	@Test
	public void testCase2() {
		Reporter.log("Testcase2 is passed successfully", true);
	}

	@Test
	public void testCase3() {
		Reporter.log("Testcase3 is passed successfully", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("logout done successfully", true);
	}

	@AfterClass
	public void closeApp() {
		Reporter.log("App is closed", true);
	}

	@AfterTest
	public void disconnectExtraConnectios() {
		Reporter.log("Extra connections are disconnected", true);
	}

	@AfterSuite
	public void jdbcDisconnect() {
		Reporter.log("JDBC is disconnected", true);
	}

}
