package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsersizechange {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.gecko.driver", "../Selenium/exe file/geckodriver.exe");
		FirefoxDriver rv = new FirefoxDriver();
		
		//open google
		
		rv .get("https://www.google.com/");
		
		// open Face book 
		rv.navigate().to("https://www.facebook.com/");
		rv.navigate().back();
		
		// get title of google and verify if google is displayed
		
				 String str=rv.getTitle();
				 
				 System.out.println("The title displayed is :" +str);
		
		
		// change browser size
		
		Dimension d=new Dimension(300,500);
		rv.manage().window().setSize(d);
		Thread.sleep(3000);
		
		// change browser position
		
		Point p = new Point(180,300);
		rv.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		// maximize window
		
				rv.manage().window().maximize();
				Thread.sleep(3000);
				
				// full screen
				
				rv.manage().window().fullscreen();
				Thread.sleep(3000);
				
				rv.close();
	}

}
