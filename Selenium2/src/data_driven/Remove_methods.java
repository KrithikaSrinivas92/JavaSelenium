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

public class Remove_methods {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="../Selenium/excel.xlsx";
		FileInputStream file= new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		
		Sheet s = book.getSheet("Sample");
		//Row r = s.createRow(0);
		//Cell c = r.createCell(0);
		//c.setCellValue("Testing");
		//FileOutputStream out = new FileOutputStream(path);
		//book.write(out);
		
		//remove row
		
		Row r = s.getRow(4);
		s.removeRow(r);
		Row r2 = s.getRow(3);
		Cell c = r2.getCell(1);
		r2.removeCell(c);
		book.removeSheetAt(2);
		FileOutputStream out= new FileOutputStream(path);
		book.write(out);
		
	}

}
