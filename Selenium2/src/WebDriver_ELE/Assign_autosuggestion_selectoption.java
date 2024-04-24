package WebDriver_ELE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_autosuggestion_selectoption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.id("APjFqb"));
		ele.sendKeys("Selenium");
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		ele.click();
		//check multiple suggestions for selenium
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath(".//ul[@class='G43f7e']/li"));
		
		
		
		
		
		
		

	
	}


	}


