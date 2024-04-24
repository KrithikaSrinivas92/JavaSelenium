package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_ErrorMessageDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("fghj");
		driver.findElement(By.name("pass")).sendKeys("ghjk");
		driver.findElement(By.xpath(".//button[text()='Log In']")).click();
		
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(".//div[text()='Facebook Will Be Back Soon']"));
		String str = ele.getText();
		if(str.contains(str))
			
		{
			System.out.println("message is displayed"+str);
		}
		else
		{
			System.out.println("message not displayed");
		}
		

	}

}
