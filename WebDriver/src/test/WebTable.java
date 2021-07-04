package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Thread.sleep(30000);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//total no.of rows
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));		
		System.out.println("Total number of rows: "+rows.size());
		//to find the row value for the first row
		/*for(int i=0;i<rows.size();i++)
		{			
			System.out.println("Text of the rows: "+rows.get(i).getText());			
		}
		*/
		
		//total no.of coloumns
		List<WebElement> coloumns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));		
		System.out.println("Total number of coloumns: "+coloumns.size());
		//To find the textvalue of the first coloumn
		/*for(int i=0;i<coloumns.size();i++)
		{			
			System.out.println("Text of the coloumn: "+coloumns.get(i).getText());			
		}
		*/
		
		WebElement rowsdata=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));		
		System.out.println("Text for 4th  rows: "+rowsdata.getText());
		
		WebElement rowsdata1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));	
		System.out.println("Data  for 4th  rows 3rd column data: "+rowsdata1.getText());
		
		//Scrolling function:
		WebElement Scrollfunc = driver.findElement(By.xpath("//h2[text()='A Special Style for One Table']"));
		/*JavascriptExecutor object=(JavascriptExecutor)driver;
		object.executeScript("arguments[0].scrollIntoView();",Scrollfunc);			
		Scrollfunc.click(); 
	*/	
		//JavascriptExecutor obj=driver;		
		driver.executeScript("arguments[0].scrollIntoView();", Scrollfunc);
		
		
		
		
		
		
		
	}

}
