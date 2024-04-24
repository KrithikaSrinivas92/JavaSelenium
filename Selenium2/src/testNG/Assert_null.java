package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_null {
	
	@Test
	public void test()
	{
		//String str1=null;
		//Assert.assertNull(str1);
		
		String str2=null;
		Assert.assertNotNull(str2); //this gives fail, because there is value in no value in str2
		
		
	}

}
