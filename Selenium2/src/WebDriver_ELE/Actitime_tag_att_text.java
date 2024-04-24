package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_tag_att_text {

	public static void main(String[] args) {

WebDriver driver =  new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");

//checkbox tagname

WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));

	String tag = ele.getTagName();
	System.out.println("The checkbox tag name is :"+tag);
	
	//checkbox attribute
	
String name = ele.getAttribute("name");
System.out.println("The checkbox attribute is :"+name);


driver.close();
	}

}
