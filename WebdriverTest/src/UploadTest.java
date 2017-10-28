import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/meenal/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.xpath(".//*[@id='file-upload']")).sendKeys("/Users/meenal/Downloads/test/abc.txt");
		driver.findElement(By.xpath(".//*[@id='file-submit']")).click();
		
		System.out.println("Testing uploading the file");

	}

}
