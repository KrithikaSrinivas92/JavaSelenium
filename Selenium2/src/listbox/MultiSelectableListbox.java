package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableListbox {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/multiplelist.html");

		WebElement rv = driver.findElement(By.id("listbox"));
		Select s = new Select(rv);
		
		//display count of all options 
		
		List<WebElement> list = s.getOptions();
		
		// option 1 
		
	/*	for(int i =0;i<list.size();i++)
		{
			WebElement rv1 = list.get(i);
			String str = rv1.getText();
			s.selectByVisibleText(str);
			
		}
		*/
		
	// option 2
		
	/*	for (int i=0;i<list.size();i++)
		{
			WebElement rv2 = list.get(i);
			String str2 = rv2.getAttribute("value");
			s.selectByValue(str2);
		}
*/
		
		// option 3
		
		for (int i=0; i<list.size();i++)
		{
			s.selectByIndex(i);
		}
	}

}
