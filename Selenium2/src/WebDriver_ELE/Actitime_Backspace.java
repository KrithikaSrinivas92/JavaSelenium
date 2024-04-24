package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_Backspace {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.xpath(".//input[@id='username']"));
		ele.sendKeys("admin");
		Thread.sleep(4000);
		
		ele.sendKeys(Keys.CONTROL+"a");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//input[@id='username']")).sendKeys(Keys.BACK_SPACE);

	}

}
