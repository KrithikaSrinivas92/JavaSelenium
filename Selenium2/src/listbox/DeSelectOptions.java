package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectOptions {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/multiplelist.html");
		
		WebElement rv = driver.findElement(By.id("listbox"));
		
		//create obj for select class
		
		Select s = new Select(rv);
		
		//to get alloptions
		
		List<WebElement> ref = s.getOptions();
		
		//select all options
		
		for (int i =0;i<ref.size();i++)
		{
			s.selectByIndex(i);
		}
		
		// de-select third option
		
		s.deselectByIndex(2);
		
		//deselect by value
		
		s.deselectByValue("Sub 4");
	
		//deselect by visibletext
		
		s.deselectByVisibleText("Selenium");
		
		//deselect all
		
		s.deselectAll();
	}

}
