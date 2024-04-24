package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartClassName {

	public static void main(String[] args) 
	{

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		//inspect search field
		
		By search_field = By.className("Pke_EE");
		WebElement ele = driver.findElement(search_field);
		ele.sendKeys("mobiles");
		

	}

}
