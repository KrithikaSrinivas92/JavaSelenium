package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ShoppersStack 
{
@Test
	public void demo()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.id("loginBtn")).click();
		
	}
}
