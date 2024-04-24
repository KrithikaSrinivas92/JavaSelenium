package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fail
{
@Test
public void test1()
{
String str1="abc";	
String str2="xyz";
Assert.assertEquals(str1,str2);

}

@Test(dependsOnMethods="test1")
public void test2()
{
	Reporter.log("Hi", true);
}

@Test
public void test3()
{
	Reporter.log("Hi", true);
}

}
