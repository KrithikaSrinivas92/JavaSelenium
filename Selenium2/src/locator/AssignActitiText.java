package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignActitiText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		//username
		
		 driver.findElement(By.id("username")).sendKeys("dfghj");
		 Thread.sleep(2000);
		
		
		//password
		
		 driver.findElement(By.name("pwd")).sendKeys("fghjk");
		 Thread.sleep(2000);
		
		//login
		
		 driver.findElement(By.id("loginButton")).click();
		 
		 //printing error message on console
		 
		 String str = driver.findElement(By.className("errormsg")).getText();
		//String s = ele.getText();
		System.out.println(str);
		
	}

}
