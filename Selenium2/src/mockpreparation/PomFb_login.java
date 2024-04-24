package mockpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PomFb_login {
	
	//declaration
	
	private WebElement email;
	private WebElement password;
	private WebElement login;
	
	// initilisation
	
	public PomFb_login(WebDriver driver)
	{
		email=driver.findElement(By.id("email"));
		password=driver.findElement(By.name("pass"));
		login=driver.findElement(By.name("login"));
		
	}
	
	//utilisation
	
	public void enteremail(String mail)
	{
	email.sendKeys(mail);	
	}
	public void enterpwd(String pass)
	{
		password.sendKeys(pass);
	}
	public void login()
	{
		login.click();
	}
}
