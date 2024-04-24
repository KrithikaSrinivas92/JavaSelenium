package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignCricbuzz {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.cricbuzz.com/");

driver.findElement(By.xpath(".//div[@id='match_menu_container']//li[1]")).click();



	}

}
