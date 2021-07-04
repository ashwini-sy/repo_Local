package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.getProperty("key", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	    WebElement From=driver.findElement(By.xpath("//a[text()=' BANK ']"));
	    WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
	    WebElement ToCredit=driver.findElement(By.xpath("//*[@id='loan']/li"));
	    Actions object=new Actions(driver);
	    //object.dragAndDrop(From, To).perform();
	    object.dragAndDrop(From, To).build().perform();

	   // object.doubleClick(From);
	    //object.dragAndDrop(From, ToCredit).build().perform();
	    
	    
	    //right click operation
	  // object.contextClick(ToCredit).build().perform();
	  // object.contextClick(ToCredit).release();
	   //mouse-hover
	    object.moveToElement(ToCredit).build().perform();
	   Thread.sleep(1000);
	    driver.close();
	    
	}

}
