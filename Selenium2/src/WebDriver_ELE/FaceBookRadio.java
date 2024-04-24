package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookRadio {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath(".//button[@type='submit']")).submit();


	}

}
