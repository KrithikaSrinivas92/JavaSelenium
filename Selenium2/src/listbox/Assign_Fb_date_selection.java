package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_Fb_date_selection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		// inspect date field
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.id("day"));
		
		//create object of select class and pass web element argument
		
		Select s = new Select(date);
		Thread.sleep(3000);
		
		//s.selectByIndex(6);
		s.selectByValue("12");
		

	}

}
