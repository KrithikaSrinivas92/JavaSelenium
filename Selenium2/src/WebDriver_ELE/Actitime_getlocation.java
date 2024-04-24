package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_getlocation {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");

		
		WebElement ele = driver.findElement(By.id("username"));
		Point p = ele.getLocation();
		int x = p.getX();
		int y = p.getY();
		
		System.out.println("The x position is :"+x);
		System.out.println("The Y position is :"+y);
		
		driver.close();
	}

}
