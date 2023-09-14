//validation of add to cart message..
package Assertions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ReusableMethodClass.ReusableMethods;

public class HardAssertion_Luma_AddtoCArtMessage_Validation {
	ReusableMethods rm = new ReusableMethods();

	@Test
	public void lumaApplicationMessageValidation() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(rm.fetchPropertyFile("lumaUrl"));
		Thread.sleep(7000); // if you comment Thread.sleep then you are bound to get
							// "ElementNotInteractableException" here..
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement women = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).perform();
		WebElement tops = driver.findElement(By.xpath("//span[text()='Tops']"));
		act.moveToElement(tops).perform();
		WebElement jackets = driver.findElement(By.xpath("//span[text()='Jackets']"));
		act.moveToElement(jackets).perform();
		jackets.click();
		WebElement clickOnJacket = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[2]"));
		clickOnJacket.click();
		WebElement colorOfJacket = driver.findElement(By.xpath("(//div[@class='swatch-option color'])[2]"));
		colorOfJacket.click();
		WebElement m_size = driver.findElement(By.xpath("(//div[@class='swatch-option text'])[5]"));
		m_size.click();
		WebElement addToCart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		addToCart.click();
		WebElement actualMessageAddress = driver
				.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
		String actualMessage = actualMessageAddress.getText();
		String expectedMessage = "You added Juno Jacket to your shopping cart.";
		Assert.assertEquals(actualMessage, expectedMessage);
		Reporter.log("Add to cart message is validated successfully", true);
	}
}
