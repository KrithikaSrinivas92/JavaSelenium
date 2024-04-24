package mockpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_linktext {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");

//driver.findElement(By.linkText("Forgot password?")).click();
driver.findElement(By.partialLinkText("For")).click();

	}

}
