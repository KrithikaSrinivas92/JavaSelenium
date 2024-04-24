package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Marks {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/webelement.html");
	
		//all column marks
		
	 List<WebElement> ref= driver.findElements(By.xpath(".//td[3]"));
	
	int s = ref.size();
	System.out.println("the total no of marks column :"+s);
	
	for (int i=0;i<s;i++)
	{
		WebElement rv=ref.get(i);
		String str = rv.getText();
		System.out.println(str);
	}

	
	}

}
