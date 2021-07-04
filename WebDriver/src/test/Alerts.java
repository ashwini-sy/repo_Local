package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("key", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		 WebElement custid=driver.findElement(By.xpath("//input[@name='cusid']"));
		 custid.sendKeys("1234");
		 WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));		 
		 submit.click();
		 
		//Hanadling alerts
		Alert ob1=driver.switchTo().alert();
	
		ob1.accept();
		ob1.accept();
		//ob1.dismiss();
		
		//To switch to parent window:
		System.out.println(driver.switchTo().defaultContent().getTitle());
		
	
		
		/*ob1.accept();
		ob1.dismiss();*/
	}

}
