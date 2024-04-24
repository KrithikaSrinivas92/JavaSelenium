package popup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload_Auto_It {

	public static void main(String[] args) throws IOException, InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://online2pdf.com/");
Thread.sleep(3000);
driver.findElement(By.xpath(".//button[text()='Select files']")).click();
//handle file upload pop up using auto it code > run exe file

Runtime.getRuntime().exec("C:\\Users\\krith\\Desktop\\java\\Selenium_folder\\AutoIt\\newupload.exe");
	}

}
