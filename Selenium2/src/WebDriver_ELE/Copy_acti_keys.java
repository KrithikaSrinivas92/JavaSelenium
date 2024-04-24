package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copy_acti_keys {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.xpath(".//input[@id='username']"));
		ele.sendKeys("admin");
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		
		//to paste inspect pwd field
		
		driver.findElement(By.xpath(".//input[@name='pwd']")).sendKeys(Keys.CONTROL+"v");

	}

}
