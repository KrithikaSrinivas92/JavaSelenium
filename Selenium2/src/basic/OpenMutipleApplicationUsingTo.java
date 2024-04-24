package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenMutipleApplicationUsingTo {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver", "../Selenium/exe file/geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		
		// to open multiple application
		
		f.get("https://www.facebook.com/");
		//f.get("https://www.google.com/");
		//f.get("https://www.facebook.com/");
		//f.get("https://www.google.com/");
		
		// using to() open multiple applications and use navigate, forward and back methods
		
		f.navigate().to("https://www.google.com");
		f.navigate().back();
		f.navigate().forward();
		Thread.sleep(3000);
		f.navigate().refresh();
		f.close();
			
	}

}
