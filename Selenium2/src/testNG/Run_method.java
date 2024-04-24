package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Run_method {
	
	@Test
	public void Signup()
	{
		Assert.fail(); //intentionally stop the execution of particular method
		Reporter.log("Signup method executed", true);
	}
	
	@Test (dependsOnMethods="Signup",alwaysRun=true) //alwaysRun => will not skip the execution of the method
	public void Login()
	{
		Reporter.log("Login method executed", true);
		
	}

}
