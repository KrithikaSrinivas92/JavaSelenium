package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fb_excel_multipledata_login {
	
	@Test
	public void login() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		//fetch data from excel
		Workbook book= WorkbookFactory.create(new FileInputStream("../Selenium/excel.xlsx"));
		
	}

}
