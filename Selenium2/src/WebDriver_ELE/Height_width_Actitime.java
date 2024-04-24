package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Height_width_Actitime {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");
WebElement ele = driver.findElement(By.id("username"));
Dimension d = ele.getSize();
int height = d.getHeight();
int width = d.getWidth();

System.out.println("Username height is :" +height);
System.out.println("Username width is:"+width);
	}

}
