package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FcaeBookLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		// to inspect user name 
		
		By email = By.id("email");
		WebElement ele1 = driver.findElement(email);
		ele1.sendKeys("k*********@gmail.com");
		Thread.sleep(3000);
		
		// to inspect password field
		
		By password = By.id("pass");
		WebElement ele2 = driver.findElement(password);
		ele2.sendKeys("********");
		Thread.sleep(3000);
		
		//to inspect login button
		
		By login = By.name("login");
		WebElement ele3 = driver.findElement(login);
		ele3.click();
	

	}

}
