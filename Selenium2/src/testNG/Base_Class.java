package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class 
{
	WebDriver driver;
	@Parameters("Browsername")
	@BeforeClass
	public void Openbrowser(String Browsername)
	{
		
		if(Browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(Browsername.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver= new EdgeDriver();
		}
	}
	@BeforeMethod
	public void OpenApplication()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod
		public void testmethodExecutionresult(ITestResult result)
		{
			String methodname = result.getName();
			if(result.getStatus()==1)
			{
				Reporter.log(methodname+"ecexution is pass", true);
			}
			else 
			{
				Reporter.log(methodname+"execution is fail", true);
			}
		}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
