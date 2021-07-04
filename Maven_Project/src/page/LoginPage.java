package page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.LoginTest;

public class LoginPage {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	//================================WebElements===============================//
	@FindBy(xpath = "//div[@class='search_topbar']")
	WebElement serachlink;
	
	@FindBy(linkText="Log in")
	WebElement Login ;
	
    @FindBy(name="user_login")
    WebElement username;
    
    @FindBy(id="password")
    WebElement pwd;
    
    @FindBy(name="btn_login")
    WebElement signin ;
    
    @FindBy(id="msg_box")
    WebElement Errormsg ;
    
	//==============Constructor==============================//
	public LoginPage() {		
		driver=LoginTest.driver;
		report=LoginTest.report;
		test=LoginTest.test;
		PageFactory.initElements(driver, this);
	}
   //===========================Method=========================//
	public void LoginPg(String un, String pw) {
		SoftAssert softseert=new SoftAssert();
		test = report.startTest("Login Page");
		
		serachlink.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		test.log(LogStatus.PASS, "Successfully clicked on the login button");	
		Login.click();

		
		username.sendKeys(un);
		test.log(LogStatus.PASS, "Successfully Entered Username");
		
		
		pwd.sendKeys(pw);
		test.log(LogStatus.PASS, "Successfully Entered Password");

		
		signin.click();
		test.log(LogStatus.PASS, "Clicked on login button succesfully");
       
        
		String ActualText = Errormsg.getText();
		String ExpText = "The email or password you have entered is invalid.";

		if(ActualText.equalsIgnoreCase(ExpText))
		test.log(LogStatus.PASS, "Entered username and pwd is mismatched");		
		else
			test.log(LogStatus.PASS, "Entered username and pwd is matched");	
		//Assert.assertTrue(Errormsg.isDisplayed());

	}

}
