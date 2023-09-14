// DataFormatter class(return type is String) helps to over come the drawback of getStringCellValues() and getNumericCellValues()..
package PropertiesFile_And_ExcelFile_DataFetching_And_DataReading;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Fetching_MultipleValues_Fetching_EntireRow {
	public static void main(String[] args) throws Throwable, IOException {
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet4");
		int lastRow = sheet.getLastRowNum();
		for (int i = 0; i <= lastRow; i++) {
			String data = df.formatCellValue(sheet.getRow(i).getCell(9));
			System.out.println(data);

		}
	}
}
