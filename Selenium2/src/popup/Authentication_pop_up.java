package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authentication_pop_up {

	public static void main(String[] args) throws AWTException, InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://the-internet.herokuapp.com/basic_auth");
Robot r = new Robot();

//enter username as admin
r.keyPress(KeyEvent.VK_A);
r.keyPress(KeyEvent.VK_D);
r.keyPress(KeyEvent.VK_M);
r.keyPress(KeyEvent.VK_I);
r.keyPress(KeyEvent.VK_N);

Thread.sleep(3000);
r.keyPress(KeyEvent.VK_TAB);

//enter pwd
r.keyPress(KeyEvent.VK_A);
r.keyPress(KeyEvent.VK_D);
r.keyPress(KeyEvent.VK_M);
r.keyPress(KeyEvent.VK_I);
r.keyPress(KeyEvent.VK_N);

Thread.sleep(3000);
r.keyPress(KeyEvent.VK_TAB);

Thread.sleep(3000);
r.keyPress(KeyEvent.VK_ENTER);


	}

}
