package WebDriver_ELE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion_google {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		//check multiple suggestions for selenium
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath(".//ul[@class='G43f7e']/li"));
		int size = list.size();
		System.out.println(size);
		
		//autosuggestion text as output
		
		for(int i=0;i<size;i++)
		{
			WebElement ele = list.get(i);
			String str = ele.getText();
			System.out.println(str);
		}
	
	}

}
