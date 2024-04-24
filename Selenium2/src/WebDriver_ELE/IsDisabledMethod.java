package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisabledMethod {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/isdisabled.html");
boolean status = driver.findElement(By.id("user")).isEnabled();
boolean status1 = driver.findElement(By.id("pass")).isEnabled();

//username field

if(status)
{
System.out.println("username field is enable");	
}
else
{
	System.out.println("username field is disabled");
	}
	

	//pwd
	if(status1)
	{
		System.out.println("password field is enabled");
	}
	else
	{
		System.out.println("pwd field is disabled");
	}
	driver.close();
	}
	
}
