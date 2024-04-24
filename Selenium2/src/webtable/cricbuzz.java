package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cricbuzz {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.cricbuzz.com/");

driver.findElement(By.xpath(".//div[@id='match_menu_container']//li[4]")).click();
driver.findElement(By.linkText("Scorecard")).click();

// identify players

String exp_01= ".//div[contains(@url,'cricket-scorecard')]//div[@id='innings_1']/div[1]//div[contains(@class,'cb-scrd-itms')]/div[@class='cb-col cb-col-25 ']/a[@class='cb-text-link']";
List<WebElement> ref1 = driver.findElements(By.xpath(exp_01));


//identify player scored run

String exp_02 = ".//div[contains(@url,'cricket-scorecard')]//div[@id='innings_1']/div[1]//div[contains(@class,'cb-scrd-itms')]/div[@class='cb-col cb-col-25 ']/a[@class='cb-text-link']/../../div[3]";
List<WebElement> ref2 = driver.findElements(By.xpath(exp_02));

for (int a=0; a<ref1.size();a++)
{
	String playername=ref1.get(a).getText();
	String runs=ref2.get(a).getText();
	System.out.println(playername+ "-" +runs);
}

	}

}
