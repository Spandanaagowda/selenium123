package testScripts;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class test3
{
@Test(priority=1)
public void test1()
{
	Reporter.log("1",true);
}
@Test()
public void test2()
{
	Reporter.log("2",true);
}

}



