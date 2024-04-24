package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class extends BaseClass
{
	
	@Test
	public void Signup()
	{
		Reporter.log("Application Sign up", true);
	}

}
