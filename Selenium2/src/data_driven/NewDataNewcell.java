package data_driven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NewDataNewcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="../Selenium/excel.xlsx";
		FileInputStream file = new FileInputStream(path);
		// open file excel sheet
		
		Workbook book = WorkbookFactory.create(file);
		//open sheet
		Sheet s = book.getSheet("Sheet1");
		Row row = s.createRow(7);
		Cell cell = row.createCell(5);
		cell.setCellValue("new data");
		FileOutputStream output=new FileOutputStream(path);
		book.write(output);
	}

}
