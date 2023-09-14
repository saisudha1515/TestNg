package PropertiesFile_And_ExcelFile_DataFetching_And_DataReading;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogIn_PropertiesFile {
	public static void main(String[] args) throws IOException  {
		FileInputStream fis = new FileInputStream("E:\\Automation_Selenium\\Testing_Punjagutta\\src\\test\\resources\\ApplicationConfig\\actitime.properties");
		Properties p = new Properties();
		p.load(fis);
		String username = p.getProperty("un");
		System.out.println(username);
		String password = p.getProperty("pwd");
		System.out.println(password);
		String url = p.getProperty("url");
		System.out.println(url);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username,Keys.TAB,password,Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER);
		
		
			}
}
