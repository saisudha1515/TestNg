
package PropertiesFile_And_ExcelFile_DataFetching_And_DataReading;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadingMultipleData_From_Excel_Both_Rows_And_Cells {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Ramana");
		int lastRow = sh.getLastRowNum();
		for (int i = 0; i < lastRow; i++) {
			int lastCell = sh.getRow(i).getLastCellNum();
			for (int j = 0; j < lastCell; j++) {
				String data = df.formatCellValue(sh.getRow(i).getCell(j));
				System.out.print(data + "   ");
			}
			System.out.println();
		}
	}
}
