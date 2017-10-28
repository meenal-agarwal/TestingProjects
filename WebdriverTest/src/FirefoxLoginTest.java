import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLoginTest {

		@Test
		public void loginTest() {
			

			System.setProperty("webdriver.gecko.driver", "/Users/meenal/Downloads/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.facebook.com");
			System.out.println("Application title is ============="+driver.getTitle());
			// driver.quit();

		}
}
