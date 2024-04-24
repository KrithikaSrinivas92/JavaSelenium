package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagName {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/tagname.html");

//inspect HTML code of component

By un = By.tagName("input");

//to perform action on that component

WebElement ele = driver.findElement(un);

//to enter text in text field

ele.sendKeys("admin");
Thread.sleep(3000);

//to clear the text in text  field

ele.clear();

	}

}
