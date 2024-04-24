package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rows {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/webelement.html");
		
//all rows

List<WebElement> ref = driver.findElements(By.xpath(".//tr"));
int s = ref.size();
System.out.println("The total no of rows : "+s);
	}

}
