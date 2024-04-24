package mockpreparation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_popup_prompt {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//click on prompt alert
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[text()='Click for JS Prompt']")).click();
		
		//switch to alert pop up
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("success");
		System.out.println("ok option is selected"+ a.getText());
		a.accept();
	

	}

}
