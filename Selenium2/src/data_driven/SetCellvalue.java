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

public class SetCellvalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="../Selenium/excel.xlsx";
		FileInputStream file = new FileInputStream(path);
		// open file excel sheet
		
		Workbook book = WorkbookFactory.create(file);
		//open sheet
		Sheet s = book.getSheet("Sheet2");
		Row r = s.getRow(0);
		
		Cell c = r.getCell(0);
		c.setCellValue("Goodevening");
		FileOutputStream out = new FileOutputStream(path);
		book.write(out);
	}

}
