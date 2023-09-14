package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ReusableMethodClass.BaseClass;
import ReusableMethodClass.BaseClassCrossBrowsing;
import ReusableMethodClass.ReusableMethods;

public class crossBrowsingTestCase1 extends BaseClassCrossBrowsing {
	@Test
	public void serchByCalls() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(ReusableMethods.fetchExcelFile("Sheet1", 0, 0));

	}

}
