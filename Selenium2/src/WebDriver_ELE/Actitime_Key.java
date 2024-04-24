package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_Key {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.xpath(".//input[@id='username']")).sendKeys("admin");
driver.findElement(By.xpath(".//input[@class='textField pwdfield']")).sendKeys("manager");
	}

}
