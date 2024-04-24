package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/id.html");
		
		// username
		By un = By.tagName("input");
		WebElement ele = driver.findElement(un);
		ele.sendKeys("admin");
		
		// password
		
		By pwd = By.id("pass");
		WebElement ele1 = driver.findElement(pwd);
		ele1.sendKeys("manager");

		//output both admin and pwd will be performed on same text field as both the tagnames are same. hence we used id locator

	}

}
