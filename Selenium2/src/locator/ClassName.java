package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/classname.html");

		// First name
		
		By Fname = By.id("name");
		WebElement ele = driver.findElement(Fname);
		ele.sendKeys("admin");
		
		//Lastname
		
	//	By Lname = By.id("name");// cannot use as both fname and lname both have id= name so we use class locator
		
		By Lname = By.className("last");
		WebElement ele1 = driver.findElement(Lname);
		ele1.sendKeys("manager");
		
		// for email component
		
		By email = By.id("email");
		WebElement ele2 = driver.findElement(email);
		ele2.sendKeys("admin@gmail.com");
		
		// for password
		
		By password = By.id("pwd");
		WebElement ele3 = driver.findElement(password);
		ele3.sendKeys("xyz");
		
		
		
	}

}
