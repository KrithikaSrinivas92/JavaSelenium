package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Name {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/name.html");
		
		By Fname = By.id("name");
		WebElement ele = driver.findElement(Fname);
		ele.sendKeys("admin");
		
		By Lname = By.className("last");
		WebElement ele1 = driver.findElement(Lname);
		ele1.sendKeys("manager");
		
		By email = By.name("mailid");
		WebElement ele2 = driver.findElement(email);
		ele2.sendKeys("xyz@gmail.com");
		
		By password = By.id("pwd");
		WebElement ele3 = driver.findElement(password);
		ele3.sendKeys("abcdefg");
		
		By confirmpassword = By.id("pass");
		WebElement ele4 = driver.findElement(confirmpassword);
		ele4.sendKeys("abcdefg");
		
		By mobile = By.id("mobile");
		WebElement ele5 = driver.findElement(mobile);
		ele5.sendKeys("99999999");
	
	
	
	
	}

}
