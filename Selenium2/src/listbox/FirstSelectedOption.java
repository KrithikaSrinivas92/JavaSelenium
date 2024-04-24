package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/multiplelist.html");

		WebElement rv = driver.findElement(By.id("listbox"));
		Select s = new Select(rv);
		List<WebElement> list = s.getOptions();
		
		for(int i =0;i<list.size();i=i+2) // i=i+2 to select alternate options
		{
		s.selectByIndex(i);
			
		}
		
		WebElement rv1 = s.getFirstSelectedOption();
		System.out.println(rv1.getText());
		driver.close();
	}

}
