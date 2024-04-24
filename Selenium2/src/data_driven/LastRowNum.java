package data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastRowNum {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="../Selenium/excel.xlsx";
		FileInputStream file = new FileInputStream(path);
		// open file excel sheet
		
		Workbook book = WorkbookFactory.create(file);
		//open sheet
		Sheet s = book.getSheet("Sheet1");
		//identify total rows used
		int count = s.getLastRowNum();
		System.out.println("Total no of rows used is:"+count);

	}

}
