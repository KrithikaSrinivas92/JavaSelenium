package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Suites {
	
	@Test
	public void test1()
	{
		Reporter.log("Test1", true);
		
	}
	@Test
	public void test2()
	{
		Reporter.log("Test2", true);
		
	}
	@Test
	public void test3()
	{
		Reporter.log("Test3", true);
		
	}
	@Test
	public void test4()
	{
		Reporter.log("Test4", true);
		
	}



}
