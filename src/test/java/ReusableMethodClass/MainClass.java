package ReusableMethodClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MainClass {
	ReusableMethods rm = new ReusableMethods();

	@Test
	public void login_actiTimeApplication() throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(rm.fetchPropertyFile("url"));
		driver.findElement(By.name("username")).sendKeys(rm.fetchPropertyFile("un"), Keys.TAB,
				rm.fetchPropertyFile("pwd"), Keys.TAB, Keys.SPACE, Keys.TAB, Keys.ENTER);
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(ReusableMethods.fetchExcelFile("Sheet1", 0, 0));

		/*
		 * rm.fetchPropertyFile("pwd")--> it is method calling fetchPropertyFile()method
		 * is accepting one parameter..we have to pass that value at the time of method
		 * calling.. and this passed value will be sent fetchPropertyFile()method local
		 * variable and from there the value will be send to getPropety() method
		 */
	}
}
