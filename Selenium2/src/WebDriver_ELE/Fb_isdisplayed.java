package WebDriver_ELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_isdisplayed {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath(".//a[text()='Create new account']")).click();
Thread.sleep(3000);
driver.findElement(By.name("reg_email__")).sendKeys("admin@gmail.com");
boolean emailfield=driver.findElement(By.name("reg_email_confirmation__")).isDisplayed();
if(emailfield)
{
System.out.println("Re-Enter email field is displayed");
}
else
{
System.out.println("Re-enter email field is not displayed");	
}
	}

}
