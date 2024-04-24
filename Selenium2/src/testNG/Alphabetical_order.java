package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Alphabetical_order {


	@Test(priority=0)
	public void CreateAccount()
	{
		Reporter.log("create account", true);
	}
	@Test(priority=1)
	
		public void EditAccount()
		{
			Reporter.log("Edit Account", true);
		}
	
	@Test(priority=2)
	public void DeleteAccount()
	{
		Reporter.log("Delete Account", true);
	}
}
