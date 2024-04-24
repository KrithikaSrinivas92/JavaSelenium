package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_checkbox_isselectedornot {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("sdfghjk");
		
		//inspect checkbox
		
		
	WebElement ele = driver.findElement(By.xpath(".//input[@id='keepLoggedInCheckBox']"));
	
	
	if(ele.isSelected())
	{
		System.out.println("checkbox selected");
		
	}
	else
	{
		System.out.println("checkbox not selected");
	}
	
	}

}
