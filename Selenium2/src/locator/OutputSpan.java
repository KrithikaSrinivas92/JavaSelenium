package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OutputSpan {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/Output.html");

String s = driver.findElement(By.id("msg")).getText();
System.out.println(s);

String s1 = driver.findElement(By.name("link")).getText();
System.out.println(s1);

String s2 = driver.findElement(By.partialLinkText("lin")).getText();
System.out.println(s2);

//this will give error as text msg is not a hyper link. partiallink and link text works only for hyperlink//String s3 = driver.findElement(By.linkText("Text Msg2 ")).getText();
//String s3 = driver.findElement(By.linkText("Text Msg2 ")).getText();
//System.out.println(s3);

	}

}
