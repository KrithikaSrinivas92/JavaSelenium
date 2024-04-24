package data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Login_excel {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");

//fetch data from excel
Workbook book= WorkbookFactory.create(new FileInputStream("../Selenium/excel.xlsx"));
//goto sheet
Row row = book.getSheet("Sheet3").getRow(1);
String un = row.getCell(0).toString();
String pwd = row.getCell(1).toString();

driver.findElement(By.id("email")).sendKeys(un);
driver.findElement(By.name("pass")).sendKeys(pwd);
driver.findElement(By.name("login")).click();

	}

}
