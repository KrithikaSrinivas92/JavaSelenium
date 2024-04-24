package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload_Approach2_RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://online2pdf.com/");
WebElement rv = driver.findElement(By.xpath(".//button[text()='Select files']"));
	rv.click();
	
	//approach 2- using robot class
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_A);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	
	}

}
