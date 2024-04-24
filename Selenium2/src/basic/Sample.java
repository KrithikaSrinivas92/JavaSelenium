package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","../Selenium/exe file/geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		f.get("https://www.facebook.com/");
		Thread.sleep(3000);
		f.close();

	}

}
