// Write multiple data for Rows
package PropertiesFile_And_ExcelFile_DataFetching_And_DataReading;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Write_Only_Row_Multiple_Data_Into_Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);

		List l = new ArrayList();
		l.add("saisudha");
		l.add("ammulu");
		l.add("pandu");
		l.add("sasi");
		l.add(4546);
		l.add(7676787364l);

		// Sheet sh = book.createSheet("MultipleDataWritingForRows");
		for (int i = 0; i < l.size(); i++) {
			book.getSheet("MultipleDataWritingForRows").createRow(i).createCell(1).setCellValue(l.get(i).toString());
			FileOutputStream fos = new FileOutputStream("E:\\Automation_Selenium\\ExcelDataFetching\\Book1.xlsx");
			book.write(fos);
			fos.flush();
		}
		System.out.println("Data has been written in Excel..");
	}
}

// toString() is used to convert Object into String..
// Close Excel file in toolbar and then run the script..


