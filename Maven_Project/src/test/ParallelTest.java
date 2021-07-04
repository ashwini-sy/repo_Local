package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	@Test
	public void simplilearnTest()
	{
		System.getProperty("webdriver.driver.chromedriver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.close();
	}
	
	@Test
	public void SwaglabTest()
	{
		System.getProperty("webdriver.driver.chromedriver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.close();
	}

}
