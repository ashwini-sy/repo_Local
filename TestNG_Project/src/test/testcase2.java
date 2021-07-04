package test;

import org.testng.annotations.Test;

public class testcase2 {
	@Test(priority=0)
	public  void loginTest()
	{
		System.out.println("Inside login test");
	}
	
	@Test(priority=1)
	public  void HomeTest()
	{
		System.out.println("Inside home test");
	}
	
	@Test(groups="Sanity",priority=0)
	public  void signupTest()
	{
		System.out.println("Inside signup test");
	}
	
	
	@Test(dependsOnMethods="signupTest",description="signout functionality working fine")
	public  void singoutTest()
	{
		System.out.println("Inside signout test");
	}
	
}
