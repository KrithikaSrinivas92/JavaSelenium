package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OptimizationActitime {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");

		// username // using optimization1
		
		WebElement ele = driver.findElement(By.id("username"));
		
		ele.sendKeys("abdc");
		Thread.sleep(3000);
		ele.clear();
		
		ele.sendKeys("1233");
		Thread.sleep(3000);
		
		// pwd => optimzation 2
		
		driver.findElement(By.name("pwd")).sendKeys("kklll");
		
	}

}
