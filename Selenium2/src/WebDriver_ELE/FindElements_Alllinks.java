package WebDriver_ELE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements_Alllinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/links.html");
//print only link1 text

WebElement ele = driver.findElement(By.id("L1"));
String str = ele.getText();
System.out.println(str);

//to print all links text

List<WebElement> ref = driver.findElements(By.tagName("a"));
for(int i=0;i<ref.size();i++)
{
WebElement rv = ref.get(i);
String str1 = rv.getText();
System.out.println(str1);
}

	}

}
