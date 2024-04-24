package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_check_isselected {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath(".//a[text()='Create new account']")).click();

Thread.sleep(3000);
WebElement female = driver.findElement(By.xpath(".//input[@value='1']"));

WebElement male = driver.findElement(By.xpath(".//input[@value='2']"));

//action 1

female.click();
boolean b1 = female.isSelected();
System.out.println("Female selected"+b1);
	if(b1)
	{
		System.out.println("female radion button is selected");
	}
	else
	{
		System.out.println("female radion button is not selected");
		
	}
	
	//action 2
	
	male.click();
	boolean b2 = male.isSelected();
	boolean b3 = female.isSelected();
	System.out.println("Male is selected"+b2);
	
	if(b2)
	{
		System.out.println("male radio button is selected");
	}
	else
	{
		System.out.println("male radio button not selected");
		
	}
	
	if(b3)
	{
		System.out.println("female radion button is selected");
	}
	else
	{
		System.out.println("female radion button is not selected");
		
	}
	driver.close();
	}
	


}
