package mockpreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PomFB_main {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");

PomFb_login rv=new PomFb_login(driver);
rv.enteremail("krithikas92@gmail.com");
rv.enterpwd("Idonotknow@1819");
rv.login();

	}

}
