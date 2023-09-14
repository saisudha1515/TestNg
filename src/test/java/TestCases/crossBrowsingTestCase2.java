package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ReusableMethodClass.BaseClass;
import ReusableMethodClass.BaseClassCrossBrowsing;
import ReusableMethodClass.ReusableMethods;

public class crossBrowsingTestCase2 extends BaseClassCrossBrowsing {
	@Test
	public void createCustomer() throws Exception {
		driver.findElement(By.cssSelector("div[id='container_tasks']")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']"))
				.sendKeys(data);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']"))
				.sendKeys(ReusableMethods.fetchExcelFile("PriyaCharbhe", 4, 3));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	}

}
