package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_Up_Down {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		Actions a = new Actions(driver);
		WebElement uname = driver.findElement(By.id("username"));
		
		// to press shift key 
		a.keyDown(Keys.SHIFT).perform();
		a.sendKeys(uname,"admin").perform();
		Thread.sleep(3000);
		
		a.keyUp(Keys.SHIFT).perform();
		a.sendKeys(uname,"manager").perform();

	}

}
