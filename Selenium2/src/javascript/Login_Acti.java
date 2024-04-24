package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Acti {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		// create javascript executor interface by typecasting
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('username').value='admin' ");
WebElement ele = driver.findElement(By.name("pwd"));
js.executeScript("arguments[0].value='manager';",ele);
	
	js.executeScript("document.getElementById('loginButton').click()");
	}

}
