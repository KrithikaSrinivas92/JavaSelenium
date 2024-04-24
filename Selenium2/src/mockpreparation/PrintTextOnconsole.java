package mockpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintTextOnconsole {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com/gmail/about/");
driver.findElement(By.linkText("Sign in")).click();
String str = driver.findElement(By.id("headingSubtext")).getText();
System.out.println("The text is: "+str);


	}

}
