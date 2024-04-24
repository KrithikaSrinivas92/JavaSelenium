package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Traversering {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/table.html");

String str = driver.findElement(By.xpath(".//tr[2]/td[3]")).getText();
//String str = driver.findElement(By.xpath(".//td[text()='Selenium']/../td[3]")).getText();

System.out.println("The cost of the selenium book is: "+str);
driver.close();
	}

}
