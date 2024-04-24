package javascript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_screenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		// take webpapge screenshot 
		
		TakesScreenshot s = (TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		
		//define location
		
		File dest = new File("../Selenium/screenshot/webpage.png");
		
		//save file and it will throw IO exception
		
		FileUtils.copyFile(src,dest);
	}

}
