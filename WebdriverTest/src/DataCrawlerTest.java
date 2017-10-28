import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataCrawlerTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/meenal/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.edmunds.com");
		driver.manage().window().maximize();
		
		WebElement box1 = driver.findElement(By.xpath(".//*[@id='edm-entry-home-page-hero-carousel']/div/div[12]/div/div[1]/div[1]/select"));	
		Select sel1 = new Select(box1);
		sel1.selectByValue("bmw");
		
		WebElement box2 = driver.findElement(By.xpath(".//*[@id='edm-entry-home-page-hero-carousel']/div/div[12]/div/div[1]/div[2]/select"));	
		Select sel2 = new Select(box2);
		sel2.selectByVisibleText("2 Series M235i xDrive");
		
		WebElement box3 = driver.findElement(By.xpath(".//*[@id='edm-entry-home-page-hero-carousel']/div/div[12]/div/div[1]/div[3]/select"));
		Select sel3 = new Select(box3);
		sel3.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='edm-entry-home-page-hero-carousel']/div/div[12]/div/div[1]/div[4]/div/button[2]")).click();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// visible
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id*='datepicker'][id*='title']")));
		button.click();

		// or exist
		WebElement button1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id*='datepicker'][id*='title']")));
		button1.click();
		
		driver.findElement(By.xpath(".//*[@id='0bed245e6b624546d3fa495516e9892f-285']")).click();
		driver.findElement(By.xpath(".//*[@id='consumer-reviews-defer']/div[1]/div/div/div/div[1]/div/div[3]/div/div/div/div[1]/a")).click();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		List<WebElement> lst = driver.findElements(By.className("individual-overal-rating"));
		lst.size();
		for(int i=0;i<lst.size();i++){
			System.out.println(lst.get(i).findElement(By.tagName("span")).getText());
		}
		
		//		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//		jse.executeScript("scroll", arg1);
	}

}
