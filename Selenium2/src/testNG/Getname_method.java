package testNG;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Getname_method {
	@Test
	public void test1()
	{
		Reporter.log("Hi",true);
	}

	@Test
	public void test2()
	{
		Reporter.log("Hello",true);
		Assert.fail();
	}
	@AfterMethod
	public void results(ITestResult r)
	{
		 String str = r.getName();
		Reporter.log(str,true);
	}
}
