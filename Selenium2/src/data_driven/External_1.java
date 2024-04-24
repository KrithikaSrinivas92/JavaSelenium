package data_driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class External_1 {

	public static void main(String[] args) throws IOException {

		// copy file from ROM to RAM
		
		FileInputStream f = new FileInputStream("../Selenium/data.properties");
		
		//open property file
		
		Properties p = new Properties();
		p.load(f);
		
		//fetch data
		
		String str = p.getProperty("email");
		String str1 = p.getProperty("password");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(str);
		driver.findElement(By.id("pass")).sendKeys(str1);
		
	}

}
