package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Attribute {

	public static void main(String[] args) {

WebDriver driver= new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/xpath_attribute.html");

//

driver.findElement(By.xpath(".//input[@id='username']")).sendKeys("abc");
driver.findElement(By.xpath(".//input[@id='pass']")).sendKeys("abc");
driver.findElement(By.xpath(".//input[@value='login']")).click();

driver.close();

	}

}
