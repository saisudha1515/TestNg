package Assertions;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import ReusableMethodClass.ReusableMethods;

public class Amazon_HomePage_Validation {
	ReusableMethods rm = new ReusableMethods();

	@Test
	public void AmazonLogin() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(rm.fetchPropertyFile("amazonUrl"));
		String expectedHomepageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Thread.sleep(3000);
		String actualHomepageTitle = driver.getTitle(); // getTitle()is used to get actual title and expected title we can get from html document, head part..
		Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
		Reporter.log("Amazon homepage is validated successfully", true);
	}

}
