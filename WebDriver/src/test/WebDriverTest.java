package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("key", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		System.out.println(driver.getTitle());

		
		WebElement serachlink=driver.findElement(By.xpath("//div[@class='search_topbar']"));
		serachlink.click();
		
		List<WebElement> spantag=driver.findElements(By.tagName("span"));
		System.out.println("span tag present in this page is "+spantag.size());
		
		
	/*	for (int i=0;i<spantag.size();i++)
		{
			System.out.println("Span tag valeu is "+spantag.get(i).getAttribute("class"));
		}
		*/
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Login = driver.findElement(By.linkText("Log in"));
		Login.click();

		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("abc@gmail.com");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("abcd");

		WebElement rememberme = driver.findElement(By.xpath("//label[@class='rememberMe']"));
		rememberme.click();

		WebElement signin = driver.findElement(By.name("btn_login"));
		signin.click();

		WebElement Errormsg = driver.findElement(By.id("msg_box"));

		String classname = Errormsg.getAttribute("class");
		System.out.println("Class name is " + classname);

		String TagName = Errormsg.getTagName();
		System.out.println("Tag name is " + TagName);

		String ActualText = Errormsg.getText();
		String ExpText = "The email or password you have entered is invalid.";

		List<WebElement> inputag = driver.findElements(By.tagName("input"));
		System.out.println("No.of  input tags are " + inputag.size());

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No.of  Links are " + links.size());

		for (int i = 0; i < links.size(); i++) {

			System.out.println("Name of the links" + links.get(i).getText());
		}
		if (ActualText.equals(ExpText)) {
			System.out.println("Enterd account is  doesnot exist");
			/*
			 * driver.findElement(By.linkText("Forgot Password?")).click();
			 * if(driver.findElement(By.name("user_email")).isEnabled()) {
			 * driver.findElement(By.name("user_email")).sendKeys("abcd@gmail.com");
			 * //driver.findElement(By.name("btn_send_email")); }
			 */
		}

		else {
			System.out.println("Enterd account is  exist");
		}
		
		
		//driver.close();

	}

}
