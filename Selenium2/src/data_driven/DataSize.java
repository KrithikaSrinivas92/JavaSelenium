package data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataSize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="../Selenium/excel.xlsx";
		FileInputStream file = new FileInputStream(path);
		// open file excel sheet
		
		Workbook book = WorkbookFactory.create(file);
		//open sheet
		Sheet s = book.getSheet("Sheet4");
		
		for(int rownum=0;rownum<=1;rownum++)
		{
			Row data = s.getRow(rownum);
			
			for(int cellnum=0;cellnum<=1;cellnum++)
			{
				Cell cell = data.getCell(cellnum);
				System.out.println(cell.toString()+" ");
			}
		System.out.println(" ");
		}

	}

}
