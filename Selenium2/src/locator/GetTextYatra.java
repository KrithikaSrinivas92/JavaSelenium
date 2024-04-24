package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextYatra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		
		WebElement ele = driver.findElement(By.className("main-heading"));
		String s =ele.getText();
		System.out.println(s);
		
	}

}
