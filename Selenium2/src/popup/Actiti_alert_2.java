package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actiti_alert_2 {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");

driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("login")).click();

driver.findElement(By.xpath(".//div[text()='Tasks']")).click();


	}

}
