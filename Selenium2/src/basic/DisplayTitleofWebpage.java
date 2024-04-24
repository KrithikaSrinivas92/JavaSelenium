package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayTitleofWebpage {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.gecko.driver", "../Selenium/exe file/geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		
		f.get("https://www.google.com/");
		
		//to get title of the page
		
		String str = f.getTitle(); //return type of title is string so store it in string variable
		
		System.out.println("The title is : " +str);
		
		// to get URL of webpage

		String str2=f.getCurrentUrl();
		
		System.out.println("The current URL is :" +str2);
	}

}
