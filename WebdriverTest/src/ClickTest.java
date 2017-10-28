import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickTest {

			public static void main(String[] args) {
				
				System.setProperty("webdriver.gecko.driver", "/Users/meenal/Downloads/geckodriver");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.facebook.com");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Meenal");
				driver.findElement(By.id("u_0_3")).sendKeys("Agarwal");
				driver.findElement(By.xpath(".//*[@id='u_0_n']/span[1]")).click();
				driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
				
				driver.navigate().back();
				System.out.println("Application title is ============="+driver.getTitle());

		//		driver.quit();

			}
}
