// invocationCount flag means, running the same test case multiple times. There is a situation like some times even though our script is correct the test cases are failing because of synchronization issues, server/browser issues, configuration issues, because of these issues our script may be failing..  
//so, in such cases i am giving one more chance to the script for execution...

package BasicTestNGCases_Flags;
import org.testng.annotations.Test;
public class Invocation_Count_Flag {
	@Test(invocationCount = 10)
	public void login() {
		System.out.println("Login done successfully");
	}
}
