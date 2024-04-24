package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DifferentBrowser {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

	}

}
