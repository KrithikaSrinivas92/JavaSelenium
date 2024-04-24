package mockpreparation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Pgm2 {

	public static void main(String[] args) {

FirefoxDriver f = new FirefoxDriver();
f.get("https://www.facebook.com/");

// to open new window

FirefoxDriver f1= new FirefoxDriver();
f1.get("https://www.google.com/");
f1.close();

	}

}
