package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_popup {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.get("https://www.abhibus.com/");
Thread.sleep(5000);
driver.findElement(By.xpath(".//span[text()='Login/Signup']")).click();
//driver.findElement(By.xpath(".//input[]@class='true mobileNo-input'")).sendKeys("1111");
Thread.sleep(3000);
driver.findElement(By.xpath(".//span[text()='Sign in with google']")).click();



	}

}
