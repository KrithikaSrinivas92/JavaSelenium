package mockpreparation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_popup_simple_alert {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//to click on simple alert
Thread.sleep(2000);
driver.findElement(By.xpath(".//button[text()='Click for JS Alert']")).click();

//switch focus from main page to alert page
Thread.sleep(2000);
Alert simple = driver.switchTo().alert();

Thread.sleep(2000);
simple.accept();
driver.close();



	}

}
