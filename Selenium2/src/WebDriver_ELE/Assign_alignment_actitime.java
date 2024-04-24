package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_alignment_actitime {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");

//username field

WebElement ele = driver.findElement(By.xpath(".//input[@id='username']"));
Point p = ele.getLocation();
int x1 = p.getX();
System.out.println("The username field alignment is :"+x1);

//password field

WebElement ele2 = driver.findElement(By.xpath(".//input[@type='password']"));
Point p2 = ele2.getLocation();
int x2 = p2.getX();
System.out.println("The pwd alignment is :"+p2);

//check if username & pwd field are aligned

if(x1==x2)
{
System.out.println("The username & pwd fieds are aligned");	
}
else
{
System.out.println("The username & pwd are not aligned");	
}
	}

}
