package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_checktext_isempty {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");

		WebElement ele = driver.findElement(By.xpath(".//input[@id='username']"));
		ele.sendKeys("xyz@gmail.com");
		
		 String str = ele.getAttribute("value");
		 
		 if(str.isEmpty())
		 {
			 System.out.println("There is no text in text field");
		 }
		 else
		 {
			 System.out.println("There is text in text field :"+ str);
			 
		 }
		

	}

}
