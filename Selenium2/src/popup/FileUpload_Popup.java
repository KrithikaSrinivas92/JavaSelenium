package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload_Popup {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/FileUploadPopUp.html");

WebElement tgt = driver.findElement(By.id("upload"));

//approach 1
String absolutefilelocation = "C:\\Users\\krith\\Desktop\\driver wifi.txt";

//sendkeys method will only take absolutepath

tgt.sendKeys(absolutefilelocation);
	}

}
