package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbTextFieldAlignment {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver =new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath(".//a[text()='Create new account']")).click();
Thread.sleep(5000);

//username
WebElement ele = driver.findElement(By.xpath(".//input[@name='firstname']"));

Point p = ele.getLocation();
int y1 = p.getY(); // to get y co-ordinate
System.out.println("The first name "+y1);

//surname

WebElement ele1 = driver.findElement(By.xpath(".//input[@name='lastname']"));
	Point p1 = ele1.getLocation();
	int y2 = p1.getY();
	
	System.out.println("The last name :"+y2);
	
	if(y1==y2)
	{
		System.out.println("first name and surname field are aligned");
		
	}
	else
	{
		System.out.println("first name and surname are not aligned");
	}
	}

}
