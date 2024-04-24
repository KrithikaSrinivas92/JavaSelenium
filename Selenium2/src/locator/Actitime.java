package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		By uname = By.id("username");
		WebElement ele = driver.findElement(uname);
		ele.sendKeys("admin");
		
		By password = By.name("pwd");
		WebElement ele2 = driver.findElement(password);
		ele2.sendKeys("manager");
		
		By checkbox = By.id("keepLoggedInCheckBox");
		WebElement ele3 = driver.findElement(checkbox);
		ele3.click();
		
		By login = By.id("loginButton");
	WebElement ele4 = driver.findElement(login);
	ele4.click();

	}

}
