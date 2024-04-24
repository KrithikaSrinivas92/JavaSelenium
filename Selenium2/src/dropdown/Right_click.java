package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws AWTException {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		WebElement ele = driver.findElement(By.xpath(".//span[text()='Domestic Flights']"));
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_D);

	}

}
