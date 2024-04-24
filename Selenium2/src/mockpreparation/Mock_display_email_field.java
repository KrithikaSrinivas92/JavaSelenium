package mockpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mock_display_email_field {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");

WebElement ele = driver.findElement(By.id("email"));
ele.sendKeys("sdfgh@gmail.com");

String str = ele.getAttribute("value");
System.out.println("The enetered text in username field is :"+str);

	}

}
