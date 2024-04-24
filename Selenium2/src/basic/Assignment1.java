package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "../Selenium/exe file/geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		
		// open the facebook url
		
		f.get("https://www.facebook.com/");
		
		// open google application
		
		f.get("https://www.google.com/");
		f.close();

	}

}
