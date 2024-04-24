package WebDriver_ELE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_Flipkart_getImage_attrvalue {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.flipkart.com/");
List<WebElement> ele = driver.findElements(By.xpath(".//img"));
int images = ele.size();

System.out.println("The total no of images is :"+images);

for(int i=0;i<ele.size();i++)
{
WebElement rv = ele.get(i);	
String str = rv.getText();
System.out.println("the image names are:"+str);
String str2 = rv.getAttribute("src");
System.out.println("the attribute value of images is:"+str2);
}

	}

}
