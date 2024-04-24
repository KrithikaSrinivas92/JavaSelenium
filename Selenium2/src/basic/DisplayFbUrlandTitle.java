package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayFbUrlandTitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "../Selenium/exe file/geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		
		//open facebook page
		
		f.get("https://www.facebook.com/");
		
		// get title of facebook
		
		 String str=f.getTitle();
		 
		 System.out.println("The title displayed is :" +str);
		 
		// to get URL of webpage

			String str2=f.getCurrentUrl();
			
			System.out.println("The current URL is :" +str2);


	}

}
