// Print all Samsung phones in the console as well as in Excel Sheet...
package PropertiesFile_And_ExcelFile_DataFetching_And_DataReading;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExcelFetching_All_Samsung {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("samsung");
		ele.submit();
		Thread.sleep(10000);
		List<WebElement> allMobilesAddress = driver.findElements(By.xpath("//span[contains(text(),'Samsung')]"));
		FileInputStream fis = new FileInputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("SamsungPhones");
		for (int i = 0; i < allMobilesAddress.size(); i++) {
			sh.createRow(i).createCell(0).setCellValue(allMobilesAddress.get(i).getText());
			FileOutputStream fos = new FileOutputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
			book.write(fos);
			fos.flush();
		}
		System.out.println("Phones data has been written in Excel...");

	}
}
