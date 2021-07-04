package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeScnshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.getProperty("key", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//TakesScreenshot Tscobj=driver;-->possible(since we cant instantiate this classs)
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		TakesScreenshot Tscobj=(TakesScreenshot)driver;
		File myfile=Tscobj.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(myfile, new File("test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Able to create new directoty to store the screenshot
		//FileUtils.copyToDirectory(myfile, new File("test1.png"));
		
		//Explicite wait
		WebElement From=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(From));
		
		
		
	}

}
