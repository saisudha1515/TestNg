package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import ReusableMethodClass.ReusableMethods;

public class Parameterization {
	@Parameters({"un","pwd"})
	@Test
	public void m1(String userName, String password) throws IOException {
		ReusableMethods rm = new ReusableMethods();
		WebDriver driver = new ChromeDriver();
		driver.get(rm.fetchPropertyFile("actiTimeURL"));
		driver.findElement(By.id("username")).sendKeys(userName,Keys.TAB, password, Keys.ENTER);
	}
}
