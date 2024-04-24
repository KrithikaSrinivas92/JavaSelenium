package data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Celldatatype_verify {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="../Selenium/excel.xlsx";
		FileInputStream file = new FileInputStream(path);
		// open file excel sheet
		
		Workbook book = WorkbookFactory.create(file);
		//open sheet
		Sheet s = book.getSheet("Sheet1");
		
		// identify row
		Row r = s.getRow(0);
		
		//identify cell
		Cell c = r.getCell(0);
		
		//identify type of data
		
		CellType datatype = c.getCellType();
		if(datatype==CellType.STRING)
		{
			String str = c.getStringCellValue();
			System.out.println(str);
		}
		else
		{
			double str= c.getNumericCellValue();
			System.out.println(str);
			
		}
	

	}

}
