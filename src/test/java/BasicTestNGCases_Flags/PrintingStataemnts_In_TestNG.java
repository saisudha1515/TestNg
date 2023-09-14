/*
 Reporter.log("message")--> it will print message only in report..
 Reporter.log("message",true)--> when we use ,true --> it will print message in both console and in testNG report..
 we should not use System.out.println(); in testNG.. even if we use also that message will not display in report....
 
 */

package BasicTestNGCases_Flags;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class PrintingStataemnts_In_TestNG {
	@Test
	public void m1() {
		System.out.println("M1 is executed..");
		Reporter.log("m1 executed in report not in console..");
		Reporter.log("m1 executed in both report and console", true);
	}
}
