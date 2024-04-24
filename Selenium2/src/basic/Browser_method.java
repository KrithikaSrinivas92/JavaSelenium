package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_method {
	
	WebDriver driver;

	public void browser (String browsername)
	{
		if (browsername.equals("Firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else if(browsername.equals("Chrome"))
		
		{
			driver = new ChromeDriver();
		}
		else
		{
			
			driver = new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.close();
		
	}
	public static void main(String[] args) 
	{
		
	Browser_method rv= new Browser_method();
	
	rv.browser("Firefox");
	rv.browser("Chrome");
	rv.browser("Edge");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
