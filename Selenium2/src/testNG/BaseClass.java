package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	@BeforeClass
	
	public void PreCondition()
	{
		
		Reporter.log("Open Browser", true);
		Reporter.log("Open Application", true);
	}
	
	@AfterClass
	public void PostCondition()
	{
		
		Reporter.log("Close Browser",true);
	}

}
