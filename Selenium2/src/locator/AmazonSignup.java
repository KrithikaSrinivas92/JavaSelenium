package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSignup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		// navigation link
		
		By navigation = By.id("nav-link-accountList-nav-line-1");
		WebElement ele1 = driver.findElement(navigation);
		ele1.click();
		Thread.sleep(2000);
		
		//create your amazon account
		
		By Create_Acc = By.id("createAccountSubmit");
		WebElement ele2 = driver.findElement(Create_Acc);
		ele2.click();
		Thread.sleep(2000);
		
		// name
		
		By name = By.id("ap_customer_name");
		WebElement n = driver.findElement(name);
		n.sendKeys("abc def");
		Thread.sleep(2000);
		
		//email
		
		By email = By.name("email");
		WebElement e = driver.findElement(email);
		e.sendKeys("fgfhjjk@gmail.com");
		Thread.sleep(2000);
		
		//password
		
		By pwd = By.id("ap_password");
		WebElement p = driver.findElement(pwd);
		p.sendKeys("abcdefgh");
		Thread.sleep(2000);
		
		// password again
		
		By pwd_recheck = By.id("ap_password_check");
		WebElement recheck = driver.findElement(pwd_recheck);
		recheck.sendKeys("abcdefgh");
		Thread.sleep(2000);
		
		// continue button
		
		
		By cont = By.id("continue");
		WebElement c = driver.findElement(cont);
		c.click();
		Thread.sleep(2000);
		
		driver.close();
		

		
		
		
		
	}

}
