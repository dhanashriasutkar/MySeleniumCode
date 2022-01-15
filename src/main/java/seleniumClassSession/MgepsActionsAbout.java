package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MgepsActionsAbout {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mgeps-uat-pune.etenders.in/");
		driver.manage().window().maximize();
		driver.findElement(By.className("close")).click();
		Thread.sleep(3000);
		
		By about=By.linkText("ABOUT");
		By help=By.xpath("//nav[@id='nav-menu-container']//a[text()='Help']");
		By manual=By.xpath("//nav[@id='nav-menu-container']//li//a[text()='Manuals']");
		threelevelMenuhandle(about, help, manual);
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
