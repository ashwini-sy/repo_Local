package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass  {
	public static  WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	XSSFWorkbook wbook;
	 XSSFSheet sheet;
	
	
	@BeforeMethod
	public void setup() throws IOException
	{
		System.getProperty("key", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		report = new ExtentReports("ExtendReport.html");
		
		FileInputStream fis = new FileInputStream("exceldata.xlsx");		   
		 wbook = new XSSFWorkbook(fis);		 
		  sheet = wbook.getSheetAt(0);
	}
		
	@AfterMethod
	public void teardown()
	{
		driver.close();
		report.endTest(test);
		report.flush();
		driver.close();
	}
	

}
