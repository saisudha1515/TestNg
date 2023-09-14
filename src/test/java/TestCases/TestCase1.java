package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ReusableMethodClass.BaseClass;
import ReusableMethodClass.ReusableMethods;

public class TestCase1 extends BaseClass {
	@Test(enabled = true) // by default enabled is true.. we have to explicitly write enabled = false then
	// this testcase will not execute..
	public void serchByCalls() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(ReusableMethods.fetchExcelFile("Sheet1", 0, 0));

	}

}
