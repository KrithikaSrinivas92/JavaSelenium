package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/webpage_iframe_02.html");
driver.findElement(By.id("user")).sendKeys("admin");

//verify frame present or not, if frame is present then switch to it

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

//enter pwd

driver.findElement(By.id("pass")).sendKeys("4455");


	}

}
