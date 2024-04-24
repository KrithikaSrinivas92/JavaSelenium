package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_length_verification {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//username
		
		WebElement ele = driver.findElement(By.id("username"));
		Dimension d = ele.getSize();
		int h1 = d.getHeight();
		int w1 = d.getWidth();
		System.out.println("The username height is :"+h1);
		System.out.println("The username width is :"+w1);
		
		//pwd

		WebElement ele1 = driver.findElement(By.name("pwd"));
		Dimension d1 = ele1.getSize();
		int h2 = d1.getHeight();
		int w2 = d1.getWidth();
		System.out.println("The pwd height is :"+h2);
		System.out.println("The pwd width is :"+w2);
		
		if(w1==w2 & h1==h2)
		{
			System.out.println("username and pwd are of same length");
		}
		else
		{
			System.out.println("username and pwd are of different length");
		}
		
	}

}
