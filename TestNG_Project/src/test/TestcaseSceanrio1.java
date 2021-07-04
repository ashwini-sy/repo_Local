package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestcaseSceanrio1 {
	
	@BeforeGroups("Sanity")
	public void beforegroup()
	{
		System.out.println("Before group");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	@Test
	public  void loginTest()
	{
		System.out.println("Inside login test");
	}
	
	
	@Test(groups= {"Sanity"})
	public  void HomeTest()
	{
		System.out.println("Inside Home test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
}
