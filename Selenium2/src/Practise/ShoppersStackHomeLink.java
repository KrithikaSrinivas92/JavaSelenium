package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class ShoppersStackHomeLink {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new EdgeDriver();
		Thread.sleep(5000);
		driver.get("https://www.shoppersstack.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("krithika1819@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("JavaSelenium@24");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.name("cart")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("svg#increase")).click();
		
		//driver.findElement(By.name("loginBtn")).click();

		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
}
}