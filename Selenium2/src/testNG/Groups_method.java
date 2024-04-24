package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups_method {
	
	@Test(dependsOnGroups="Sample")
	
	public void test1()
	{
		Reporter.log("test 1", true);
		
	}
	
@Test(groups="Sample")
	
	public void test2()
	{
		Reporter.log("test 2", true);
		
	}

@Test(groups="Sample")

public void test3()
{
	Reporter.log("test 3", true);
	
}

@Test(groups="Sample")

public void test4()
{
	Reporter.log("test 4", true);
	
}
@Test(groups="Sample")

public void test5()
{
	Reporter.log("test 5", true);
	
}





}
