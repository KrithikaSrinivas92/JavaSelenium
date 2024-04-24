package WebDriver_ELE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_display_disabled_enabled_links {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		List<WebElement> ref = driver.findElements(By.xpath(".//a"));
		
		int s = ref.size();
		System.out.println("Total no of links in gmail is :"+s);
		// how many links are enabled/disabled
		
		int enabled=0;
		int disabled=0;
		
		for(int i=0;i<s;i++)
		{
			WebElement rv = ref.get(i);//get links
			boolean b = rv.isEnabled();
			if(b)
			{
				enabled++;
			}
			else
			{
				disabled++;
			}
		
		}
System.out.println("No of links enabled is:"+enabled);
System.out.println("No of links disabled is :"+disabled);
	}

}
