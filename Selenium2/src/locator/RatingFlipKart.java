package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RatingFlipKart {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath(".//input[@class='Pke_EE']")).sendKeys("Redmi 9A Sport");
		driver.findElement(By.xpath(".//button[@class='_2iLD__']")).submit();
//driver.findElement(By.className("L0Z3Pu")).click();
		
		
		
		
	}

}
