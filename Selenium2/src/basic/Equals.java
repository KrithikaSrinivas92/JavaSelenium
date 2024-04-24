package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Equals {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "../Selenium/exe file/geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		
		// to verify if google webpage is displayed or not
		
		f.get("https://www.google.com/");
		String s=f.getTitle();

		if(s.equals("Google"))
		{
			System.out.println("Page Displayed");
		}
		else
		{
			System.out.println("Page not displayed");
		}
		
		if(s.contains("g"))
		{
			System.out.println("contains text");
		}
		else
		{
			System.out.println("does not contains text");
		}
		if(s.equalsIgnoreCase("gOOgle"))
		{
			System.out.println("displays even case sensitive");
		}
		else
		{
			System.out.println("not displayed");
		}
	}


}
