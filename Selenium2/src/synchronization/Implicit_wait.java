package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_wait {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.xpath(".//a[text()='Forgot password?']")).click();
driver.findElement(By.id("identify_email")).sendKeys("dfghjk");
driver.findElement(By.id("did_submit")).click();

	}

}
