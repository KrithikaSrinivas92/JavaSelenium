package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitiIvalidLogin {
	
	@FindBy(id="username") // declaration
	private WebElement un;// initiliasisation

	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement chk;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	@FindBy(xpath="(.//span[@class ='errormsg'])")
	private WebElement errormsg;
	
	public ActitiIvalidLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//utilisation
	
	public void login(String user, String pass)
	{
		un.sendKeys(user);
		pwd.sendKeys(pass);
		chk.click();
		login.click();
		
	}
	
	//to display error message or not
	
	public void verifyerrormsg()
	{
		if(errormsg.isDisplayed())
		{
		
		String str = errormsg.getText();
		System.out.println(str);
		}
		else
		{
			System.out.println("error message not displayed");
		}
	}
}


