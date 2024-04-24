package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCssvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath(".//img[@alt='Flipkart']"));

		// for css value
		String css = ele.getCssValue("font-size");
		System.out.println(css);
		
String css1 = ele.getCssValue("font-family");
System.out.println(css1);
	}

}
