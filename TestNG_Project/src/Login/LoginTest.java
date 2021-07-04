package Login;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
 SoftAssert softseert=new SoftAssert();
	@BeforeMethod
	public void setup() {
		System.getProperty("key", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		System.out.println(driver.getTitle());
		report = new ExtentReports("ExtendReport.html");
		
		
	}

	@Test
	@Parameters({ "username", "password" })
	public void Login(String un, String pwd) {

		test = report.startTest("Login Page");
		WebElement serachlink = driver.findElement(By.xpath("//div[@class='search_topbar']"));
		serachlink.click();

		List<WebElement> spantag = driver.findElements(By.tagName("span"));
		System.out.println("span tag present in this page is " + spantag.size());

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		test.log(LogStatus.PASS, "Successfully clicked on the login button");
		WebElement Login = driver.findElement(By.linkText("Log in"));
		Login.click();

		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys(un);
		test.log(LogStatus.PASS, "Successfully Entered Username");
		WebElement pwd1 = driver.findElement(By.id("password"));
		pwd1.sendKeys(pwd);
		test.log(LogStatus.PASS, "Successfully Entered Password");

		WebElement signin = driver.findElement(By.name("btn_login"));
		signin.click();

		WebElement Errormsg = driver.findElement(By.id("msg_box"));

		String ActualText = Errormsg.getText();
		String ExpText = "The email or password you have entered is invalid";

		Assert.assertTrue(Errormsg.isDisplayed());
/*
		try {
			Assert.assertEquals(ActualText, ExpText);			
			test.log(LogStatus.PASS, "Expected error msg is  matching with actual error msg");
			
		} catch (Throwable e) {
			System.out.println("catch block");
			test.log(LogStatus.FAIL, "Expected error msg is not matching with actual error msg");
		}*/
		
		
		//softseert.assertEquals(ActualText, ExpText);
	    System.out.println("After the assert statemnet");

		WebElement rememberme = driver.findElement(By.xpath("//label[@class='rememberMe']"));
		rememberme.click();

	}
	/*
	 * @Test
	 * 
	 * @Parameters({"username","password"}) public void Login1(String un,String pwd)
	 * { WebElement
	 * serachlink=driver.findElement(By.xpath("//div[@class='search_topbar']"));
	 * serachlink.click();
	 * 
	 * List<WebElement> spantag=driver.findElements(By.tagName("span"));
	 * System.out.println("span tag present in this page is "+spantag.size());
	 * 
	 * driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	 * 
	 * WebElement Login = driver.findElement(By.linkText("Log in")); Login.click();
	 * 
	 * WebElement username = driver.findElement(By.name("user_login"));
	 * username.sendKeys(un);
	 * 
	 * WebElement pwd1 = driver.findElement(By.id("password")); pwd1.sendKeys(pwd);
	 * 
	 * WebElement signin = driver.findElement(By.name("btn_login")); signin.click();
	 * 
	 * }
	 * 
	 * 
	 */

	@AfterMethod
	public void teardown() {

		report.endTest(test);
		report.flush();
		driver.close();
		
		softseert.assertAll();
	}

}
