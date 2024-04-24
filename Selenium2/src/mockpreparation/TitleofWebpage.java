package mockpreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleofWebpage {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();
		
		// to open facebook application
		
		driver.get("https://www.facebook.com/");
		
		//get title
		String str = driver.getTitle();
		System.out.println("The title of the webpage is: "+str);
		
		//URL of webpage
		
		String str2 = driver.getCurrentUrl();
		System.out.println("The url of the webpage is:" +str2);
	

	}

}
