package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeLogin_main {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("actitime");

ActitimeTimeLogin act=new ActitimeTimeLogin(driver);
act.enterusername("admin");
act.enterpassword("manager");
act.clickloginbutton();
act.selectcheckbox();
	}

}
