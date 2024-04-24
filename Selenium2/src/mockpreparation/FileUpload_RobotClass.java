package mockpreparation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload_RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

WebDriver driver = new FirefoxDriver();
driver.get("https://online2pdf.com/");
Thread.sleep(2000);
WebElement rv = driver.findElement(By.xpath(".//button[text()='Select files']"));
rv.click();

Robot r = new Robot();
r.keyPress(KeyEvent.VK_B);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_ENTER);

	}

}
