package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_pop_up {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//1.simple alert Pop-up

//driver.findElement(By.xpath(".//button[text()='Click for JS Alert']")).click();

//to switch from webpage to alert

//Alert simple_alert = driver.switchTo().alert();
//Thread.sleep(3000);
//System.out.println("Simple Alert pop up text :"+simple_alert.getText());
//simple_alert.accept();

//2. Prompt AlertPop up

//driver.findElement(By.xpath(".//button[text()='Click for JS Prompt']")).click();
//Thread.sleep(3000);
//Alert pa = driver.switchTo().alert();
//pa.sendKeys("selenium");
//pa.accept();

//3. confirmation pop_up

driver.findElement(By.xpath(".//button[text()='Click for JS Confirm']")).click();
Thread.sleep(3000);
Alert cp = driver.switchTo().alert();
cp.accept();

	}

}
