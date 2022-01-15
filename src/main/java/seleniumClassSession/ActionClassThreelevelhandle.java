package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassThreelevelhandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		By mainMenu=By.id("ctl00_HyperLinkLogin");
		By parentMenu=By.linkText("SpiceClub Members");
		By childMenu=By.linkText("Member Login");
		threelevelMenuhandle(mainMenu, parentMenu, childMenu);
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void threelevelMenuhandle(By mainMenu,By parentMenu,By childMenu) throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(mainMenu)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		getElement(childMenu).click();;
	}

	
}
