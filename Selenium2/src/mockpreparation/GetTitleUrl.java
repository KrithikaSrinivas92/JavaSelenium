package mockpreparation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleUrl {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		
		String str = driver.getTitle();
		System.out.println("The title is :"+str);
		
		String str2 = driver.getCurrentUrl();
		System.out.println("The current URL is :"+str2);
		
		if(driver.equals("Flight"))
		{
			System.out.println("yes");
		}
		else
		{System.out.println("no");
			
		}
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		Dimension d = new Dimension(100, 300);
		driver.manage().window().setSize(d);
		
		Point p = new Point(500,200);
		driver.manage().window().setPosition(p);
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		driver.close();
		
		
	}

}
