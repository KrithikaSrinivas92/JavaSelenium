package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_copy_tab_key_paste {

	public static void main(String[] args) {


	WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");

	WebElement ele = driver.findElement(By.xpath(".//input[@id='username']"));
	ele.sendKeys("abcd");
	
	//copy text from username
	
	ele.sendKeys(Keys.CONTROL+"c");
	ele.sendKeys(Keys.TAB);
	
	driver.findElement(By.xpath(".//input[@name='pwd']")).sendKeys(Keys.CONTROL+"v");
	}

}
