package mockpreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckPageDisplayed {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com/");

String str = driver.getTitle();

if(str.equals("Google"))
{
	System.out.println("The google page is displayed");
	}
else
{
	System.out.println("facebook not displayed");
}
if (str.contains("oo"))
	{
	System.out.println("contains oo");
	}
else
{
	System.out.println("not contains google");
	}
if(str.equalsIgnoreCase("Gle"))
{
	System.out.println("ignore case displayed");
	}
else
{
	System.out.println("not case sensitive displayed");
	}
	}

}
