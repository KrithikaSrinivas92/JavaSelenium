package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Signup {
	
	@Test(groups="smoke testing")
	public void m1()
	{
		Reporter.log("smoke Testing - m1 method executed", true);
		}
	@Test(groups="positive testing")
	public void m2()
	{
		Reporter.log("positive Testing - m2 method executed", true);
		}
	@Test(groups="negative testing")
	public void m3()
	{
		Reporter.log("negative Testing - m3 method executed", true);
		}
}
