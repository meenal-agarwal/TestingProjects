package test.webdriver.project;

import com.openqa.selenium.ChromeDriver;
import com.openqa.selenium.FirefoxDriver;
import com.openqa.selenium.InternetExplorerDriver;
import com.openqa.selenium.WebDriver;

public class TestSample {

	public static void main(String[] args) {
	
//////		FirefoxDriver driver = new FirefoxDriver();
//		InternetExplorerDriver driver = new InternetExplorerDriver();
////		ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.click("Submit button");
		driver.sendKeys("TextBox", "Webdriver");
		

	}

}


