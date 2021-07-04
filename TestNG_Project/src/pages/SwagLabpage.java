package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import swagtest.swagTest;

public class SwagLabpage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	//===============WebElement===============//
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement login;
	
	//===========Constructor====================//
	public SwagLabpage()
	{
		driver=swagTest.driver;
		report=swagTest.report;
		test=swagTest.test;
	}
	
	public void SwagPage(String un,String pwd)
	{
	test=report.startTest("SwabLab Login Page");
	
	username.sendKeys(un);
	test.log(LogStatus.PASS, "Entered username succesfully");
	
	password.sendKeys("secret_sauce");
	test.log(LogStatus.PASS, "Entered Password succesfully");
	
	login.click();
	test.log(LogStatus.PASS, "Login button clicked succesfully");
	}
}
