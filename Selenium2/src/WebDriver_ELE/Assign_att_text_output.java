package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_att_text_output {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");

 WebElement ele = driver.findElement(By.xpath(".//input[@id='email']"));
 ele.sendKeys("abc@gmail.com");
 
 
String str = ele.getAttribute("value");
System.out.println("The entered text in username field is :"+str);
	}

}
