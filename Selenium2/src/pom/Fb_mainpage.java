package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_mainpage {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");
FB_LoginPage rv = new FB_LoginPage(driver);
rv.login("abc@gmail.com", "abc123");
driver.close();


	}

}
