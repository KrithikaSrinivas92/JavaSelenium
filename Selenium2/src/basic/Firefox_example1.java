package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_example1 {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.gecko.driver", "../Selenium/exe file/geckodriver.exe");
FirefoxDriver f= new FirefoxDriver();

f.get("https://www.facebook.com/");

// open new window

FirefoxDriver f1= new FirefoxDriver();
f.get("https://www.google.com/");
f1.close();
f.close();

	}

}
