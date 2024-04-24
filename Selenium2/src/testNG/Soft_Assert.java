package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	public void test()
	{
		String str1="Hello";
		String str2="Hi";
		String str3="Hello";
		
		SoftAssert soft = new SoftAssert();
		Reporter.log("Verification-1 Started",true);
		soft.assertEquals(str1, str2);
		Reporter.log("Verification-1 Stopped",true);
	
		Reporter.log("Verification-2 Started",true);
		soft.assertEquals(str1, str3);
		Reporter.log("Verification-2 Stopped",true);
	
		Reporter.log("Verification-3 Started",true);
		soft.assertEquals(str2, str3);
		Reporter.log("Verification-3 Stopped",true);
		
		//to show failure
		
		soft.assertAll();
	}
@Test
public void test1()
{
	
	Reporter.log("test1", true);
}
}
