package ExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx"); //getting the specified file for read operation
		Workbook wb = WorkbookFactory.create(fis); // it makes the file ready for read operation
		Sheet sh = wb.getSheet("validdata");
		Row row = sh.getRow(3); //Specifies the Row
		Cell cell = row.getCell(1); //Specifies the Column
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
	}

}
