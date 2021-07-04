package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("key", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement fileinput=driver.findElement(By.xpath("//input[@class='upload_txt']"));
		fileinput.sendKeys("C:\\Users\\user\\Desktop\\reportium.txt");
		
		WebElement tandc=driver.findElement(By.xpath("//input[@name='terms']"));
		tandc.click();
		
		WebElement submitbutton=driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitbutton.click();
		
		WebElement msg=driver.findElement(By.xpath("//div[@class='formbuttons']/h3"));
		System.out.println("Msg after the file upload "+msg.getText());
		
	}

}
