package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_true_or_false {
	
	@Test
	public void test()
	{
		
		//assert true
		
		//boolean b=true;
		//Assert.assertTrue(b);
		
		//assert false
		
		boolean b=false;
		Assert.assertFalse(b);
	}

}
