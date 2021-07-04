package test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcasesceanrio1 {
	
	@BeforeMethod(groups= {"Sanity"})
	public void setup()
	{
		System.out.println("Inside before method");
	}

	@Test(groups= {"Sanity"})
	public  void loginTest1()
	{
		System.out.println("Inside login1 test");
	}
	
	
	@Test
	public  void HomeTest1()
	{
		System.out.println("Inside Home1 test");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Inside after method");
	}
	
}
