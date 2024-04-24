package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageFactoryActi_main {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("actitime");
		
		ActitiIvalidLogin rv= new ActitiIvalidLogin(driver);
				rv.login("abc", "fghjk");
				rv.verifyerrormsg();
				
				driver.close();

	}

}
