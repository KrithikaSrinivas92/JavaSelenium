package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css_Xp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/css_xp.html");

driver.findElement(By.cssSelector("input [type='text']")).sendKeys("ghjk");
driver.findElement(By.cssSelector("input[type='text']")).sendKeys("fghjk");
driver.findElement(By.cssSelector("input[type='text']")).sendKeys("fghj");
driver.findElement(By.cssSelector("input[type='text']")).sendKeys("dfghjkl@gmail.com");
driver.findElement(By.cssSelector("input[type='button']")).click();

	}

}
