package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Name_Google {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//enter text in search field
		
		By search = By.name("q");
		WebElement ele = driver.findElement(search);
		ele.sendKeys("Selenium");

	}

}
