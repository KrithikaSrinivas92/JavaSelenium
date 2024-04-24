package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
Actions a = new Actions(driver);
WebElement drag_ele = driver.findElement(By.id("draggable"));
WebElement drop_ele = driver.findElement(By.id("droppable"));
Thread.sleep(3000);

//approach 1

//a.dragAndDrop(drag_ele, drop_ele).perform();

//approach 2

//a.moveToElement(drop_ele).perform();
//a.clickAndHold(drag_ele).perform();
//a.moveToElement(drop_ele).perform();
//a.release().perform();
	
	// approach 3
//a.clickAndHold(drag_ele).moveToElement(drop_ele).release().build().perform();
	
	
	// approach 4

a.dragAndDropBy(drag_ele, 300,500).perform();
driver.close();
	}

}
