package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSendKeysandClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		By emailID=By.id("input-email");
		By password=By.id("input-password");
		By loginbtn=By.xpath("//input[@value='Login']");
		
//		Actions act=new Actions(driver);
//		act.sendKeys(driver.findElement(emailID), "dhanashri@gmail.com").perform();
//		act.sendKeys(driver.findElement(password), "dsa@1234").perform();
//		act.click(driver.findElement(loginbtn)).perform();
		
		doActionSendKeys(emailID, "dhanashri@gmail.com");
		doActionSendKeys(password, "dsa@1234");
		doActionClick(loginbtn);
		
		
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionSendKeys(By locator,String value) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	public static void doActionClick(By locator) {
		Actions act=new Actions(driver);
		act.click(getElement(locator)).perform();
	}

}
