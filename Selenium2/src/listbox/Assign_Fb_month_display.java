package listbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_Fb_month_display {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		// inspect month field
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		
		Thread.sleep(3000);

		
		// create object for select class and passed web elememt argument

		Select dropdown = new Select(month);
		List<WebElement> allOptionsElement = dropdown.getOptions();
		
		// creating a list to store drop down
	
		List options = new ArrayList();
		
		for(WebElement optionElement : allOptionsElement)
		{
			options.add(optionElement.getText());
			
		}
		
		System.out.println("Options in dropdown with default order :"+options);
	
	// creating a temp list to sort
		
		List templist = new ArrayList(options);
		Collections.sort(templist);
		
		System.out.println("sorted list is :"+templist);
	
	}

	}

