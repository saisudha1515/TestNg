// // 7.4 is preferable version for testng.. add testng jar from maven repositories to project.. and remove scope from testng..because when we download the testng is there in our Eclips but it is not there in our project so, we have to add the testng jar to project..

package BasicTestNGCases_Flags;
import org.testng.annotations.Test;
public class TestNgBasicCase {
	@Test
	public static void m1() {
		System.out.println("m1() Executed");
	}
}
