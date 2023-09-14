// Write single data into Excel // and here we dont require Data formatter class.. we require File output stream()..

package PropertiesFile_And_ExcelFile_DataFetching_And_DataReading;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Write_Single_DataInto_Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
//		Sheet sh = book.createSheet("SinleDataFetch");
//		Row row = sh.createRow(0);
//		Cell cell = row.createCell(0);
//		cell.setCellValue("Ammulu"); 
		// we can't use duplicate sheet. For the first we created the sheet from the secong time onwords we get the sheet row and cell..
		book.getSheet("SinleDataFetch").createRow(11).createCell(11).setCellValue("AMMULU");

		FileOutputStream fos = new FileOutputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("Data written in Excel.."); // it is just like confirmation message whether the data has been written in the Excel or not..
	}
}
