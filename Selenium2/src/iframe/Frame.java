package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/webpage_iframe_02.html");
		
		driver.findElement(By.id("user")).sendKeys("admin");
		
		// switch focus to inner frame
		
		//approach 1 using int
		driver.switchTo().frame(0);
		driver.findElement(By.id("pass")).sendKeys("abcd");
		
		//approach 2 using string
		//driver.switchTo().frame("q");
		//driver.findElement(By.id("pass")).sendKeys("abcd");
		
		//approach 3 using xpath
		//WebElement tgt = driver.findElement(By.xpath(".//iframe"));
		//driver.switchTo().frame(tgt);
		//driver.findElement(By.id("pass")).sendKeys("abcd");
		
		//email field
		
		driver.findElement(By.id("email")).sendKeys("dfghj@gmail.com");
		
		
		//switch control back to default/parent page to enter text for contact which is in main frmae
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("number")).sendKeys("85635");
	}

}
