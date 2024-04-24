package javascript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot_Login {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//identify the element
Thread.sleep(3000);
	WebElement tgt = driver.findElement(By.name("login"));
	
	//take screenshot
	File src = tgt.getScreenshotAs(OutputType.FILE);
	
	//define location
	
	File dest = new File("../Selenium/screenshot/Login.png");
	
	//store screenshot in location
	
	FileUtils.copyFile(src,dest);
	
	}

}
