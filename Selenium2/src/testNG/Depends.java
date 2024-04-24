package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends {
	
	@Test
	
	public void Contact()
	{
		Reporter.log("Contact Added", true);
		
	}
	
	@Test(dependsOnMethods="Contact") // chat method depends on Contact method
	
	public void Chat()
	{
	Reporter.log("Chat", true);
		
	}

}
