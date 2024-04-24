package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Different_Annotations {
	
	@BeforeMethod
	public void Login()
	{
		Reporter.log("Login to Application",true);
		
	}
	
	@Test
	public void AddUser()
	{
		Reporter.log("User added",true);
	}
	@Test(priority =1)
	public void ModifyUser()
	{
		Reporter.log("User Details modified",true);
	}
	@Test(priority=2)
	public void DeleteUser()
	{
		Reporter.log("User deleted",true);
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout from Application",true);
	}

}
