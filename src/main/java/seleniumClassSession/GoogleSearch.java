package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Naveen Automation lab");
		Thread.sleep(3000);
		//List<WebElement> list=driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='wM6W7d']/span"));
		List<WebElement> suggList = 
				driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']//span"));
		
		
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("naveen automation labs github")) {
				e.click();
				break;
			}
		}
		

	}

}
