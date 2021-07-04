package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

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
		//Signup sceanrio
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("ash");
		WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		Lastname.sendKeys("shar");
		WebElement phnumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phnumber.sendKeys("8970483193");
		WebElement newpawd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		newpawd.sendKeys("Asg@3456");
	
		///select the dropdown options
		WebElement DOB=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select obj1=new Select(DOB);
		//obj.selectByVisibleText("12");
		//obj.selectByValue("12");
		obj1.selectByIndex(11);
		WebElement DOM=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select obj2=new Select(DOM);
		obj2.selectByVisibleText("Oct");
		
		WebElement DOY=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select obj3=new Select(DOY);
		obj3.selectByValue("1995");
		
		WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		//span[@data-name='gender_wrapper']//label[text()='Female']
		//input[@type='radio' and @value='1']
		WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup.click();
		
		
		//driver.close();
		
		
		
		
		
		
		

	}

}
