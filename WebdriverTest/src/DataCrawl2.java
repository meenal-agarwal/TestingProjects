import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DataCrawl2 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "/Users/meenal/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.edmunds.com/bmw/2-series/2016/consumer-reviews/pg-1/");
//		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();

		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		List<WebElement> lst = driver.findElements(By.className("individual-review-container"));
		lst.size();
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i).findElement(By.className("rating-big")).getAttribute("title"));
			System.out.print("\t");
			System.out.print(lst.get(i).findElement(By.className("reviewTitle")).getText());
			System.out.print("\t");
			System.out.print(lst.get(i).findElement(By.tagName("time")).getAttribute("datetime"));
			System.out.print("\t");
			System.out.print(lst.get(i).findElement(By.cssSelector(".review-text.style-class-crr")).getText());
			System.out.println();
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/meenal/Downloads/Naman/tem1"));

		for (WebElement wb : lst) {

			bw.write(wb.findElement(By.className("rating-big")).getAttribute("title"));
			bw.write("\t");
			bw.write(wb.findElement(By.className("reviewTitle")).getText());
			bw.write("\t");
			bw.write(wb.findElement(By.tagName("time")).getAttribute("datetime"));
			bw.write("\t");
			bw.write(wb.findElement(By.cssSelector(".review-text.style-class-crr")).getText());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
		List<WebElement> web = driver.findElements(By.xpath(".//*[@id='pagination-holder-listUpperFooter']").tagName("a"));
		System.out.println(web.size());
		
		for(int i=1; i<=web.size(); i++){
			List<WebElement> list = driver.findElements(By.className("individual-review-container"));
			lst.size();
			for (int j = 0; i < lst.size(); i++) {
				System.out.print(lst.get(i).findElement(By.className("rating-big")).getAttribute("title"));
				System.out.print("\t");
				System.out.print(lst.get(i).findElement(By.className("reviewTitle")).getText());
				System.out.print("\t");
				System.out.print(lst.get(i).findElement(By.tagName("time")).getAttribute("datetime"));
				System.out.print("\t");
				System.out.print(lst.get(i).findElement(By.cssSelector(".review-text.style-class-crr")).getText());
				System.out.println();
			}

			driver.findElement(By.xpath(".//*[@id='pagenum_"+i+++"']")).click();
		}

	}

}
