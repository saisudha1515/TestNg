//Print all Iphones in the console and in Excel sheet...
package PropertiesFile_And_ExcelFile_DataFetching_And_DataReading;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFetching_All_Iphones {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"E:\\Automation_Selenium\\Testing_Punjagutta\\src\\test\\resources\\ApplicationConfig\\flipcart.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		System.out.println(url);
		String name = p.getProperty("phoneType");
		System.out.println(name);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);

		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
		}
		driver.findElement(By.name("q")).sendKeys(name);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> allPhonesAddress = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		// List<WebElement> allPhonesAddress1 = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		FileInputStream fis1 = new FileInputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sh = book.getSheet("IphonesNames");  /// Give this sheet name in the excel...
		for (int i = 0; i < allPhonesAddress.size(); i++) {
			sh.createRow(i).createCell(0).setCellValue(allPhonesAddress.get(i).getText());
			FileOutputStream fos = new FileOutputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
			book.write(fos);
			fos.flush();
		}
		System.out.println("Data passed..");
	}

}
