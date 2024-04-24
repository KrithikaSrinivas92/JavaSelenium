package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/cssSelector.html");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("fgh");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("fgh");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	}

}
