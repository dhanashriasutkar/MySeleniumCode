package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeActionclass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://mrbool.com/");
		
//		By contentMenu=By.className("menulink");
//		By courseMenu=By.linkText("COURSES");
		
		WebElement contentMenu=driver.findElement(By.className("menulink"));
		Actions act= new Actions(driver);
		act.moveToElement(contentMenu).perform();
	}

}
