package mockpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/sample.html");

driver.findElement(By.tagName("input")).sendKeys("fghj");
driver.findElement(By.className("pwd")).sendKeys("ghjk");
driver.findElement(By.className("input[type='text']")).sendKeys("hj");
driver.findElement(By.tagName("input")).click();






	}

}
