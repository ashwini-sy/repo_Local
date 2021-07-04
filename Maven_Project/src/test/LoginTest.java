package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import page.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test(enabled=false)
	@Parameters({"username","password"})
	public void Login(String username,String password )
	{
		LoginPage obj=new LoginPage();
		obj.LoginPg(username, password);		
	}
	
	@Test	
	public void LoginTestcase( )
	{
		LoginPage obj=new LoginPage();
	
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
		String password=sheet.getRow(1).getCell(1).getStringCellValue();
		obj.LoginPg(username, password);		
	}
	
	

}
