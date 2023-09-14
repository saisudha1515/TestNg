// more than one @Test we can have in the same class..
package BasicTestNGCases_Flags;

import org.testng.annotations.Test;

public class Case1 {
	@Test
	public void m1() {
		System.out.println("M1 is Running");
	}

	@Test
	public void m2() {
		System.out.println("M2 is Running");
	}

	@Test
	public void m3() {
		System.out.println("M3 is Running");
	}
}
