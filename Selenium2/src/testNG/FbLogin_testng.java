package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FbLogin_testng {
@Test
public void testlogin()
{
WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
driver.findElement(By.id("pass")).sendKeys("fghj");
}
}
