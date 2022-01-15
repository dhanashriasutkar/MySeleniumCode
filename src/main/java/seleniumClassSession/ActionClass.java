package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://mrbool.com/");
	//	WebElement contentMenu= driver.findElement(By.className("menulink"));
//		Actions act=new Actions(driver);
//		act.moveToElement(contentMenu).perform();
//		
//		driver.findElement(By.linkText("COURSES")).click();
		By contentMenu=By.className("menulink");
		By coursesMenu=By.linkText("COURSES");
		twoLevelMenuHandle(contentMenu, coursesMenu);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void twoLevelMenuHandle(By parentMenu,By childMenu) {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		getElement(childMenu).click();
		
		
	}

}
