package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basic.Firefox_example1;

public class Explicit {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//to verify if login page is displayed or not
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.titleContains("login"));
		
		//verify element displayed or not
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		System.out.println("The username field is displayed");
		
		//verify checkbox selected or not
		
		//w.until(ExpectedConditions.elementToBeSelected(By.id("")))
		

	}

}
