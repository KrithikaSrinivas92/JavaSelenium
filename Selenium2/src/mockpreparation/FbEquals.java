package mockpreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbEquals {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		String str = driver.getTitle();

		System.out.println(str);
		
		if(str.equals("Facebook - log in or sign up"))
		{
			System.out.println("page displayed");
		}
		else
		{
			System.out.println("page not displayed");
			
		}
		if(str.contains("Face"))
		{
			System.out.println("Displays facebook");
		}
		else
		{
			System.out.println("not display fb");
		}
		if(str.equalsIgnoreCase("FAce"))
		{
			System.out.println("displays case not sensitive");
			
		}
		else
		{
			System.out.println("not case sensitive");
		}
		driver.close();
	}

}
