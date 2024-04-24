package listbox;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Dob {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		
	// approach 1
		
		Thread.sleep(3000);
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath(".//option[text()='25']")).click();
		
		// approach 2
		
	WebElement month = driver.findElement(By.id("month"));
	month.click();
	//month.sendKeys("jan");
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_UP);
	r.keyPress(KeyEvent.VK_UP);
	r.keyPress(KeyEvent.VK_UP);
	r.keyPress(KeyEvent.VK_UP);
	r.keyPress(KeyEvent.VK_ENTER);
	
	// approach 3
	
	WebElement year = driver.findElement(By.id("year"));
	
	//create object of select class
	
	Select s = new Select(year);
	Thread.sleep(3000);
	s.selectByIndex(7);
	
	Thread.sleep(3000);
	s.selectByValue("2006");
	
	Thread.sleep(3000);
	s.deselectByVisibleText("1992");

	}

}
