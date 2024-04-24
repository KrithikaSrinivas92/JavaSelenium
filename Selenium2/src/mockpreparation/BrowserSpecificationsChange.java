package mockpreparation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSpecificationsChange {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();

driver.get("https://www.google.com/");
Thread.sleep(1000);

driver.navigate().to("https://www.facebook.com/");
Thread.sleep(1000);

driver.navigate().back();
Thread.sleep(1000);

driver.navigate().forward();
Thread.sleep(1000);

driver.navigate().refresh();
Thread.sleep(1000);

//change browser size

Dimension d = new Dimension(300, 400);
driver.manage().window().setSize(d);
Thread.sleep(1000);

// change browser position

Point p = new Point(100, 200);
driver.manage().window().setPosition(p);
Thread.sleep(1000);

//maximize browser

driver.manage().window().maximize();
Thread.sleep(1000);

//minimize

driver.manage().window().minimize();
Thread.sleep(1000);

//full screen

driver.manage().window().fullscreen();
Thread.sleep(1000);
driver.close();
	}

}
