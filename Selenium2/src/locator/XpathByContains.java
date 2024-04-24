package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByContains {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.xpath(".//input[@id='username']")).sendKeys("abcd");
driver.findElement(By.xpath(".//input[@name='pwd']")).sendKeys("abcd");
driver.findElement(By.xpath(".//a[contains(@id,'loginButton')]")).click();
String str = driver.findElement(By.className("errormsg")).getText();
System.out.println(str);
	}

}
