package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeTimeLogin {
	
	// declaration
	
	private WebElement username;
	private WebElement password;
	private WebElement checkbox;
	private WebElement loginbutton;
	
	//Initialization
	
	public ActitimeTimeLogin(WebDriver driver)
	{
		username=driver.findElement(By.id("username"));
		password=driver.findElement(By.name("pwd"));
		checkbox=driver.findElement(By.id("KeepLoggedInCheckbox"));
		loginbutton=driver.findElement(By.id("loginButton"));
	}
	
	//utilization
	
	public void enterusername(String name)
	{
		username.sendKeys(name);
		
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void selectcheckbox()
	{
		checkbox.click();
	}
	
	public void clickloginbutton()
	{
		loginbutton.click();
	}
}
