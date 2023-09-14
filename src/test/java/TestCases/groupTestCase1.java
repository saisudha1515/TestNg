package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ReusableMethodClass.BaseClassGroups;
import ReusableMethodClass.ReusableMethods;

public class groupTestCase1 extends BaseClassGroups {
	@Test(groups = "ST") // by default enabled is true.. we have to explicitly write enabled = false then
							// this testcase will not execute..
	public void serchByCalls() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(ReusableMethods.fetchExcelFile("Sheet1", 0, 0));

	}
}
