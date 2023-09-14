package ReusableMethodClass;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassGroups {
	public WebDriver driver;
	public ReusableMethods rm = new ReusableMethods();
	Random r = new Random();
	int num = r.nextInt(100);
	public String data = "Seetha" + num;

	@BeforeClass(alwaysRun = true) // all test cases will gonna execute when you write alwaysRun=true ...whatever you written in testng xml file ang groups does not matther, execute the test cases in normal flow..                                   //(groups = "ST") only smoke tets cases run..if you want to run (alwaysRun=true) in base class , except somke test cases remaining test cases will run as usual/in a normal way.only test cases lo type of testcases rasthe chalu no need to write in base class..
	public void AppOpen() throws IOException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(rm.fetchPropertyFile("url"));
	}

	@BeforeMethod (alwaysRun = true)                                             //(groups = "ST")
	public void login() throws IOException {
		driver.findElement(By.name("username")).sendKeys(rm.fetchPropertyFile("un"), Keys.TAB,
				rm.fetchPropertyFile("pwd"), Keys.TAB, Keys.SPACE, Keys.TAB, Keys.ENTER);
	}

	@AfterMethod(alwaysRun = true)                                               //(groups = "ST")
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@AfterClass (alwaysRun = true)                                               //(groups = "ST")
	public void closeApp() {
		driver.quit();
	}
}
