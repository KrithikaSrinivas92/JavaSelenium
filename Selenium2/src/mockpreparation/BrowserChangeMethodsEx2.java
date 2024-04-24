package mockpreparation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserChangeMethodsEx2 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com/");
Thread.sleep(2000);

driver.navigate().to("https://www.facebook.com/");
Thread.sleep(2000);

driver.navigate().back();
Thread.sleep(2000);

String str = driver.getTitle();
System.out.println("The page displayed is : "+str);

Thread.sleep(2000);
//change browser size

Dimension d= new Dimension(100, 200);
driver.manage().window().setSize(d);
Thread.sleep(2000);

//position

Point p = new Point(250,400);
driver.manage().window().setPosition(p);
Thread.sleep(2000);

//maximize
driver.manage().window().maximize();
Thread.sleep(2000);

driver.navigate().to("https://www.facebook.com/");
String str2 = driver.getTitle();
System.out.println("The webpage displayed is: "+str2);
Thread.sleep(2000);

driver.navigate().refresh();
Thread.sleep(2000);

driver.manage().window().minimize();
Thread.sleep(2000);

driver.close();


	}

}
