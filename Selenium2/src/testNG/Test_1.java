package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_1 {
	
	@Test
	public void test1()
	{
		//System.out.println("hello"); //displays output in console
	
		Reporter.log("hello");//to print output in testng emailable report
		
		Reporter.log("hello", true);// to print output in both console and emailable report
	
	}

}
