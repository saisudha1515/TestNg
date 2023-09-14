package PropertiesFile_And_ExcelFile_DataFetching_And_DataReading;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetching_Fetching_SIngleValue {
	public static void main(String[] args) throws IOException {
		// How to get path of file/ excel :: right click on the file and go to properties --> security --> copy path and paste the path in FileInputStream
		FileInputStream fis = new FileInputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(13);
		Cell cell = row.getCell(14);
	//	String text = cell.getStringCellValue();
	//	System.out.println(text);
		double num = cell.getNumericCellValue();  // why double? because double can hold anything and implicit conversion will be done between int and double if you write int we can handle double and it requires Explicit conversion..
		System.out.println(num);

	}
}
