package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Attribute_Tagname {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
			driver.get("file:///C:/Users/krith/Desktop/HTML/Attribute_tagname.html");
		
			//identify element
			
		WebElement ele = driver.findElement(By.id("L1"));
		
		//element tagname
		
		String tag = ele.getTagName();
		System.out.println("The tag name is :"+tag);
		
		//element attribute
		
		String att = ele.getAttribute("class");
		System.out.println("The attribute name is :"+att);
		
		//to get text
		
		String text = ele.getText();
		System.out.println("The text is:"+text);

	}

}
