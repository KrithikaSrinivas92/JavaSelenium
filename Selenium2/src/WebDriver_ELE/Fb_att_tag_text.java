package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_att_tag_text {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");

//inspect forgotten pwd

WebElement ele = driver.findElement(By.linkText("Forgot password?"));

String tag = ele.getTagName();
System.out.println("Element tagname is :"+tag);

String att = ele.getAttribute("href");
System.out.println("element attribute value is :"+att);

String text = ele.getText();
System.out.println("element text is :"+text);

driver.close();

	}

}
