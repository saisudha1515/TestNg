import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_Iphones {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("iphone");
		List<WebElement> ele = driver.findElements(By.cssSelector("div[role='presentation']"));
		for (WebElement i : ele) {
			System.out.println(i.getText());
//			if (i.getText().contains("12")) {
//				i.click();
//			}
//		}

	}
	}
}

