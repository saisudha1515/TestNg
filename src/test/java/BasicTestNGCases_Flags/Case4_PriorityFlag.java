/*   PRIORITY FLAG..
 If the method is having @Test then only it will be considered as Test case and it is eligible for execution..If any method does not have @Test annotation then that is not considered as test case and that is not eligible for execution..
 we have to use @Test annotation above the method..
 When we give priority then the test cases will be executed in that priority. 
 if we do not give priority then the test cases will be executed in the alphabetical order..
 when you don't give priority then the priority will be 0 
 we can also give negative priority to the test cases and first negative, second 0 priority ,finally the positive priority order will be executed..
 we can provide same priority for the test cases , in such cases the same priority test cases will be executed in alphabetical order.. 
 we can provide characters in priority flag.. but we can't provide string in priority flag..because character have ASCII values but String do not have ASCII values..
 */


package BasicTestNGCases_Flags;
import org.testng.annotations.Test;
public class Case4_PriorityFlag {
	@Test(priority = -2)
	public void g() {
		System.out.println("hey..");
	}

	@Test(priority = -1)
	public void d() {
		System.out.println("Hi, all");
	}

	@Test(priority = 'A')
	public void r() {
		System.out.println("My ASCII number will be printed ");
	}

	@Test(priority = 70)
	public void s() {
		System.out.println("My priority is 70 so, i will be executed at last ");
	}

	@Test(priority = 1)
	public void c() {
		System.out.println("Good Morning");
	}

	@Test(priority = 2)
	public void a() {
		System.out.println("Good Afternoon");
	}

	@Test(priority = 3)
	public void b() {
		System.out.println("Good evening");
	}

	@Test
	public void f() {
		System.out.println("Hope you are doing great..");
	}

	@Test(priority = 5)
	public void m() {
		System.out.println(
				"I am having same priority but i (i.e, m) will be executed first because in alphabetical order i am the first character among n, p");
	}

	@Test(priority = 5)
	public void n() {
		System.out.println(
				"I am having same priority but i will be executed second because in alphabetical order i will come after m character ");
	}

	@Test(priority = 5)
	public void p() {
		System.out.println(
				"I am having same priority but i will be executed third because in alphabetical order i will come after n character ");
	}

	@Test
	public void h() {
		System.out.println("Thank you ! bye..bye");
	}

	public void i() { // this method do not have @Test annotation so this is not considered as test
						// case and it is not eligible for execution.. this method will not be executed
		System.out.println("Take care..");
	}

}
