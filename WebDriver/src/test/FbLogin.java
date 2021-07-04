package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("key", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement englishlink=driver.findElement(By.xpath("//a[text()='English (UK)']"));
		englishlink.click();
		WebElement CreatAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		CreatAccount.click();

		///select the dropdown options
		WebElement DOB=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select obj=new Select(DOB);
		
		obj.selectByVisibleText("12");
		//obj.selectByValue("12");
		//obj.selectByIndex(11);
	

		
		
		System.out.println(driver.findElement(By.xpath("//div[@id='globalContainer']//div/h2")).getText());
		//-------Make use of contians------------------
		//h2[contains(text(),"share with")]
		
		/*
		WebElement CreatAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		CreatAccount.click();*/
		/*
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		CreatAccount.sendKeys("abcd");*/
		
		
		//a[contains(@data-testid,'open')]
		//a[text()='Create New Account']
		//*[contains(text(),'Forgotten password?')]
		
		//instead of contains
		//*[starts-with(text(),"Facebook helps")]
		//*[starts-with(text(),"Create")]
		
		
		//div[@id='content']/following-sibling::div
		
		/*WebElement Username=driver.findElement(By.xpath("//input[@name='email']"));
		Username.sendKeys("abc@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("abcd");
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
		loginbtn.click();
		
		WebElement errormsg=driver.findElement(By.xpath("//div[@id='error_box']"));
		if(!errormsg.getText().isEmpty())
		{
			System.out.println("Account details is not exists");
		}*/
		
		
	}

}
