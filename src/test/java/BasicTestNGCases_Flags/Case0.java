// @Test is the advanced version for main().we can't have more than one main()in java class and we can have more than one @Test in a single class..

package BasicTestNGCases_Flags;
import org.testng.annotations.Test;
public class Case0 {
	@Test
	public void m1() {
		System.out.println("M1 Running");
	}
}
