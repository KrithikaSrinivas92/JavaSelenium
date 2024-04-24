package WebDriver_ELE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_getAttri_googleLink {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		List<WebElement> ref = driver.findElements(By.xpath(".//a"));
		int s = ref.size();
		System.out.println("Total no links is :"+s);

		for (int i=0;i<s;i++)
		{
		WebElement rv = ref.get(i);	
		String str = rv.getText();

		//to get attribute value for all links in google
		String attributevalue = rv.getAttribute("href");
		System.out.println(str);
		System.out.println("The attribute value is :"+attributevalue);
		}

			}

	}


