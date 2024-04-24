package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Yatra_ex1 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.yatra.com/");

Thread.sleep(3000);
WebElement tgt = driver.findElement(By.xpath(".//span[text()='+ More']"));

// create object of action class
Actions a = new Actions(driver);

// to move to specific/targeted element and perform execution

a.moveToElement(tgt).perform();
driver.findElement(By.xpath(".//span[text()='Cruise']")).click();
	}

}
