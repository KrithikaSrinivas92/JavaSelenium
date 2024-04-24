package mockpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByClassName {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/sample.html");

driver.findElement(By.tagName("input")).sendKeys("abcd");
driver.findElement(By.className("pwd")).sendKeys("fghj");


	}

}
