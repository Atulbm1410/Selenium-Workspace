package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib1 {
	
	public String readExcelData1(String excelPath, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis1 = new FileInputStream(excelPath);
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sh1 = wb1.getSheet(sheetName);
		Row row1 = sh1.getRow(rowCount);
		Cell cell1 = row1.getCell(cellCount);
		String data1 = cell1.getStringCellValue();
		return data1;
	}
	
	public void writeExcelData1(String excelPath, String sheetName, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis1 = new FileInputStream(excelPath);
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sh1 = wb1.getSheet(sheetName);
		Row row1 = sh1.getRow(rowCount);
		Cell cell1 = row1.createCell(cellCount);
		cell1.setCellValue(data);
		
	}
	
	public int getRowCount1(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis1 = new FileInputStream(excelPath);
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sh1 = wb1.getSheet(sheetName);
		int rc1 = sh1.getLastRowNum();
		return rc1;
	}

}
