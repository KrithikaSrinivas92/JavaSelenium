package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FB_LoginPage {
	
	private WebElement email;
	private WebElement pwd;
	private WebElement login;
	
	public FB_LoginPage(WebDriver driver)
	{
		email=driver.findElement(By.id("email"));
		pwd=driver.findElement(By.id("pass"));
		login=driver.findElement(By.name("login"));
	}
	
	public void login(String mail,String pass)
	{
	email.sendKeys(mail);
	pwd.sendKeys(pass);
	login.click();
		
	}

}
