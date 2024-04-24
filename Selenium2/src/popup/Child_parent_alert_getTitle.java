package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_parent_alert_getTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("login_Layer")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(".//span[text()='Sign in with Google']")).click();

		Thread.sleep(3000);

		// to get count of page opened

		Set<String> s = driver.getWindowHandles();
		
		//to iterate to next page/items
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext())
		{
			String refid = itr.next();
			driver.switchTo().window(refid);
			String title = driver.getTitle();
			System.out.println("The title is :"+title);
		}
	}

}
