package testng.tutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class WordpressLoginTest {

		WebDriver driver;
		
		/*
		 * Below test is dependent on the dataprovider, first it will take data from dataprovider
		 * then will execute the test case.
		 */
		@Test(dataProvider="wordpressData")
		public void logonToWordpress(String username, String password) throws Exception{
			
			System.setProperty("webdriver.gecko.driver", "/Users/meenal/Downloads/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://wordpress.com/wp-login.php");

			driver.findElement(By.id("user_login")).sendKeys(username);
			driver.findElement(By.id("user_pass")).sendKeys(password);
			
			driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
			
			Thread.sleep(5000);
			
			Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to login-Invalid Credential");
			
			System.out.println("Page title verified - User is able to login Successfully");
			
		}	
		
		/*
		 * after every test case it will run tesrDown method
		 */
		
		@AfterMethod
		public void tearDown(){
			driver.quit();

	}
		
		/*
		 * Below annotation will provide data one by one to the testcase defined for this name 
		 */
		@DataProvider(name="wordpressData")
		public Object[][] passData(){
			
			Object[][] data = new Object[3][2];
			data[0][0] = "admin1";
			data[0][1] = "demo1";
			
			data[1][0] = "admin";
			data[1][1] = "demo123";
			
			data[2][0] = "admin2";
			data[2][1] = "demo1234";
			
			return data;
		}

}
