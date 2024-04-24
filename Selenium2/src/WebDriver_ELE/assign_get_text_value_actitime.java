package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assign_get_text_value_actitime {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");

WebElement ele = driver.findElement(By.xpath(".//input[@id='username']"));
ele.sendKeys("xyz@gmail.com");

String str = ele.getAttribute("value");
System.out.println("The enetered text in username field is :"+str);
	}

}
