//  if we do not want to include any test case for execution then we go for this enabled flag
// by default enabled is true(if we do not specify any thing..)but we have to specifically mention that enabled = false.
// enabled = false test case will not be executed...

package BasicTestNGCases_Flags;
import org.testng.annotations.Test;
public class Enabled_Flag {
	@Test()
	public void appOpen() {
		System.out.println("App is opened");
	}

	@Test(priority = 1)
	public void login() {
		System.out.println("login done..");
	}

	@Test(enabled = false) // this login() method will not execute..
	public void diplayHomePage() {
		System.out.println("Home page is displayed..");
	}

	@Test(priority = 2)
	public void logout() {
		System.out.println("app is closed");
	}
}
