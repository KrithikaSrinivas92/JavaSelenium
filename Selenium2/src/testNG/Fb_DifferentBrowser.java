package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Fb_DifferentBrowser extends Base_Class {

	@Test
	public void testfacebookcreateaccount()
	{
		driver.findElement(By.xpath(".//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
	
	}
}
