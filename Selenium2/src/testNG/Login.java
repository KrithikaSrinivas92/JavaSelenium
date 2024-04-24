package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login 
{

	@Test(groups="smoke testing")
	public void m4()
	{
		Reporter.log("smoke Testing - m4 method executed", true);
		}
	@Test(groups="positive testing")
	public void m5()
	{
		Reporter.log("positive Testing - m5 method executed", true);
		}
	@Test(groups="negative testing")
	public void m6()
	{
		Reporter.log("negative Testing - m6 method executed", true);
		}	
	
}
