package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ReusableMethodClass.ReusableMethods;

public class DataProvider_ActiTime {
	@DataProvider
	public Object dataStored() {
		Object x[][] = new Object[3][2];
		x[0][0] = "admin";
		x[0][1] = "manager";
		x[1][0] = "    ";
		x[1][1] = "manager";
		x[2][0] = "admin";
		x[2][1] = "     ";
		return x;
	}

	@Test(dataProvider = "dataStored")
	public void m1(String userName, String password) throws IOException {
		ReusableMethods rm = new ReusableMethods();
		WebDriver driver = new ChromeDriver();
		driver.get(rm.fetchPropertyFile("actiTimeURL"));
		driver.findElement(By.id("username")).sendKeys(userName, Keys.TAB, password, Keys.ENTER);

	}
}
