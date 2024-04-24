package mockpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload_sendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/FileUploadPopUp.html");
		Thread.sleep(3000);
		WebElement file = driver.findElement(By.id("upload"));
		
		String path="C:\\Users\\krith\\Desktop\\driver wifi.txt";
		file.sendKeys(path);
		

	}

}
