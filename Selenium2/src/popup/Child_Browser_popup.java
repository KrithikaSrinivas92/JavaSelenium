package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_Browser_popup {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver =new FirefoxDriver();
driver.get("https://www.naukri.com/");
Thread.sleep(3000);
WebElement rv = driver.findElement(By.id("login_Layer"));
rv.click();

Thread.sleep(3000);
driver.findElement(By.xpath(".//span[text()='Sign in with Google']")).click();

Thread.sleep(3000);

// to get count of page opened

Set<String> s = driver.getWindowHandles();
int count = s.size();
System.out.println("The number of pages opened is :"+count);





	}

}
