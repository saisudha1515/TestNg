/*
once the method have any compilation error then that particular method will fail, and it's dependent method will be skipped from execution..
In testNg if any one testcase/@test method have any compilation error then also the execution will be happen..suppose in java if we have any compilation errors then the program will not execute until and unless we resolve the compilation error.. 
use {} when you declare more than one method in dependsOnMethods flag..
we can skip the test-cases by using dependeOnMethods flag...

*/

package BasicTestNGCases_Flags;
import org.testng.annotations.Test;
public class Case5_dependsOnMethods_01 {
	@Test
	public void login() {
		System.out.println("Login done successfully");
	}

	@Test
	public void appOpen() {
		System.out.println("Open App first");
	}

	@Test(dependsOnMethods = { "appOpen", "login" })
	public void homePageDisplay() {
		System.out.println("Since the app is opened and lonin is done. Hence, homePage is displayed successfully..");
	}

	@Test(dependsOnMethods = "login")
	public void quitApp() {
		System.out.println("Close the app");
	}
}
