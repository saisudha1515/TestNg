// If we declare @Test annotation outside of the class then that @Test is applicable to all the methods which are present inside the class..but in real time we never use this concept..

package BasicTestNGCases_Flags;
import org.testng.annotations.Test;
@Test
public class Case3 {
	public void m1() {
		System.out.println("M1 is executed");
	}

	public void m2() {
		System.out.println("M2 is executed");
	}

	public void m3() {
		System.out.println("M3 is executed");
	}

	public void m4() {
		System.out.println("M4 is executed");
	}

}
