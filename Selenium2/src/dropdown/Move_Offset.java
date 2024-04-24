package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_Offset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions a = new Actions(driver);
		WebElement drag_ele = driver.findElement(By.id("draggable"));
		WebElement drop_ele = driver.findElement(By.id("droppable"));
		
		Thread.sleep(3000);
		int drag_xloc=drag_ele.getLocation().getX();
		int drag_yloc = drag_ele.getLocation().getY();
		
		//a.moveToElement(drag_ele).clickAndHold().moveByOffset(drag_xloc, drag_yloc).release();

		a.moveToElement(drag_ele).perform();
		a.clickAndHold().perform();
		a.moveByOffset(drag_xloc, drag_yloc).release().build().perform();
		
	}

}
