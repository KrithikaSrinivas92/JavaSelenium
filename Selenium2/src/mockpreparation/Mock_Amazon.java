package mockpreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mock_Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		//launch amazon webpage
		
		driver.get("https://www.amazon.ca/");
		Thread.sleep(2000);
		
		//get title of amazon webpage
		
		String str = driver.getTitle();
		System.out.println("The title is :"+str);
		
		//get url of the webpage
		
		String str2 = driver.getCurrentUrl();
		System.out.println("The URL of the webpage is: "+str2);
	}

}
