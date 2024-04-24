package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Context_Click {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath(".//img[contains(@alt,'Flat 12% OFF')]"));
		
	}

}
