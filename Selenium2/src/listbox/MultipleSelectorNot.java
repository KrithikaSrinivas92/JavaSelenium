package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectorNot {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/krith/Desktop/HTML/multiplelist.html");

//listbox

WebElement rv = driver.findElement(By.id("listbox"));
Select s = new Select(rv);
boolean b = s.isMultiple();

if(b)
{
System.out.println("listbox is multi selectable");	

}
else
{
System.out.println("listbox is not multi selectable");	
}

	}

}
