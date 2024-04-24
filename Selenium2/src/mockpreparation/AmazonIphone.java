package mockpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonIphone {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.amazon.ca/");

//to inspect search field

  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
  driver.findElement(By.id("nav-search-submit-button")).click();
  
  

	}

}
