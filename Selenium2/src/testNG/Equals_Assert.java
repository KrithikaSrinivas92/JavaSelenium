package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Equals_Assert 
{
@Test
public void test()
{
	String str1="Hi";
	String str2="Hello";
	
	String str3="hi";
	String str4="hi";
	
	//Assert.assertEquals(str1, str2);
	//Assert.assertNotEquals(str1, str2);
	Assert.assertEquals(str3, str4);
	
	//assert true
	
	boolean b=true;
	Assert.assertTrue(b);
}
}
