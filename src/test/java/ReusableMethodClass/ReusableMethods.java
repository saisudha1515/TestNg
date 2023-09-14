// all reusable methods should return some thing.. then only we can use these methods in any other classes..

package ReusableMethodClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReusableMethods {
	public String fetchPropertyFile(String key) throws IOException { // fetchPropertyFile() is non static method so, if you want to use this method you should create object for this class first and by using this class object referance we can use this ReusableMethods class methods..
		FileInputStream fis = new FileInputStream(
				"E:\\Automation_Selenium\\TestNg__Maven_Punjagutta\\src\\test\\resources\\ApplicationConfig\\config.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

	public static String fetchExcelFile(String sheetName, int row, int cell) throws Exception {
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("D:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		String data = df.formatCellValue(book.getSheet(sheetName).getRow(row).getCell(cell));
		return data;

	}
}
