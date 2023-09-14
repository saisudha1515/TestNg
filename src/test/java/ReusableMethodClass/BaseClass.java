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


public class BaseClass {
	public static WebDriver driver;
	public ReusableMethods rm = new ReusableMethods();
	Random r = new Random();
	int num = r.nextInt(100);
	public String data = "Seetha" + num;

	@BeforeClass
	public void AppOpen() throws IOException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(rm.fetchPropertyFile("actiTimeURL"));
	}

	@BeforeMethod
	public void login() throws IOException {
		driver.findElement(By.name("username")).sendKeys(rm.fetchPropertyFile("un"), Keys.TAB,
				rm.fetchPropertyFile("pwd"), Keys.TAB, Keys.SPACE, Keys.TAB, Keys.ENTER);
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}
