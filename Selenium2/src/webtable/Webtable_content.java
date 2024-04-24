package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_content {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/krith/Desktop/HTML/webelement.html");
		
		List<WebElement>  ref= driver.findElements(By.xpath("//tr"));
		for (int i =0; i< ref.size();i++)
		{
			WebElement rv= ref.get(i);
			String str=rv.getText();
			System.out.println(str);

}


	}

}
