package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	
	@Test(invocationCount=10)//display create acct 10 times
	
	//@Test(enabled=false)// to skip display create acct
	public void CreateAccount()
	{
		
		Reporter.log("Create Account", true);;
	}

}
