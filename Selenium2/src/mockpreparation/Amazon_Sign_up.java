package mockpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Sign_up {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.amazon.ca/");
driver.findElement(By.id("nav-link-accountList")).click();
driver.findElement(By.id("createAccountSubmit")).click();
driver.findElement(By.id("ap_customer_name")).sendKeys("dfghjk");

	}

}
