package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id_Amazon {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		//
		
		By Search = By.id("twotabsearchtextbox");
		WebElement ele = driver.findElement(Search);
		ele.sendKeys("Iphone");
		
		// to click on search
		
		By click = By.id("nav-search-submit-button");
		WebElement ele1 = driver.findElement(click);
		ele1.click();


	}

}
