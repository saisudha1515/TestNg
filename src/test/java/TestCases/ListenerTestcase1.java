package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import ReusableMethodClass.BaseClass;
import ReusableMethodClass.ReusableMethods;

@Listeners(com.qsp.listener.ITestListenerImpClass.class)    /// write fully qualified name and fully qualified name means package name+current class name and write .class here because when we declare listeners at class level write .class in listeners annotation.. 
public class ListenerTestcase1 extends BaseClass {
	@Test
	public void serchByCalls() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(ReusableMethods.fetchExcelFile("Sheet1", 0, 0));

	}

}


// write fully qualified name 
// how can we get the fully qualified name? --> select class name--> right click--> copy qualified name 