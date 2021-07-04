package shoppingApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginApp {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.getProperty("chromedriver.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void Login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

	@Test(dependsOnMethods = "Login", description = "signout functionality working fine")
	public void AddToCart() throws Exception {

		WebElement addtocart = driver
				.findElement(By.xpath("//div[@class='inventory_list']/div[1]//button[text()='Add to cart']"));
		addtocart.click();
		System.out.println("Click on the addcart");

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
