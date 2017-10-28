import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/meenal/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
//		System.out.println(driver.switchTo().frame(0).getPageSource());
//		System.out.println(driver.switchTo().frame(1).getPageSource());
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		if(driver.findElement(By.id("content")).getText().equalsIgnoreCase("middle"))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
