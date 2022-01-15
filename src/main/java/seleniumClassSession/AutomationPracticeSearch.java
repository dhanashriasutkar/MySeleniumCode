package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//div[@class='ac_results']//li[text()='Evening Dresses > Printed ']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		
		for(WebElement e : list) {
			String text=e.getText();
			//System.out.println(text);
			if(text.contains("Evening Dresses")) {
				e.click();
				break;
			}
		}
	}

}
