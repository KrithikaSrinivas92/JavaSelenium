package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_Fb_count_option_year {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();



//inspect year listbox 
Thread.sleep(4000);
WebElement year = driver.findElement(By.id("year"));

// create select class object

Select s = new Select(year);
Thread.sleep(3000);
List<WebElement> option = s.getOptions();


//get count
Thread.sleep(3000);
int count = option.size();
System.out.println("The total count of year field is :"+count);

	}

}
