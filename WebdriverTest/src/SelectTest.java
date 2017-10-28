import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/meenal/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement web1 = driver.findElement(By.xpath(".//*[@id='month']"));
		Select sel1 = new Select(web1);
		sel1.selectByIndex(11);
		
		WebElement web2 = driver.findElement(By.xpath(".//*[@id='day']"));
		Select sel2 = new Select(web2);
		sel2.selectByValue("2");
		
		WebElement web3 = driver.findElement(By.xpath(".//*[@id='year']"));
		Select sel3 = new Select(web3);
		sel3.selectByVisibleText("1988");
		
		/**
		 * Using getOptions from Select class for getting all values in a dropdown
		 */
		List<WebElement> options = sel1.getOptions();
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++){
			System.out.println(options.get(i).getText());
		}
		
		/**
		 * Using By.tagName for getting all values for a TAG "span".
		 */
		List<WebElement> lst = driver.findElements(By.tagName("span"));
		System.out.println(lst.size());
		
		for(int i=0;i<lst.size();i++){
			System.out.println(lst.get(i).getText());
		}
		
		/**
		 * Using By.tagName for getting all values for a TAG "a" (links) 
		 * and "options" (dropdowm values).
		 */
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Totals links are: " +links.size());
		
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getAttribute("href"));
		}

		/**
		 * Using By.tagName for getting all values for a TAG "a" (links) for particular block.
		 */
		WebElement block = driver.findElement(By.xpath(".//*[@id='pageFooter']"));
		List<WebElement> link = block.findElements(By.tagName("a"));
		System.out.println("Totals links are: " +link.size());
		
		for(int i=0;i<link.size();i++){
			System.out.println(link.get(i).getText());
		}
	}

}
