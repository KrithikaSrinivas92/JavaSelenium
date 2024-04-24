package data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TotalCellinRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="../Selenium/excel.xlsx";
		FileInputStream file = new FileInputStream(path);
		// open file excel sheet
		
		Workbook book = WorkbookFactory.create(file);
		//open sheet
		Sheet s = book.getSheet("Sheet1");
		int count = s.getLastRowNum();
		
		for (int i=0;i<=count;i++)
		{
			Row totalRow = s.getRow(i);
			short totalCell = totalRow.getLastCellNum();
			System.out.println(totalCell);
		}

	}

}
