package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterusingActions {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By fName=By.id("input-firstname");
		By lName=By.id("input-lastname");
		By emailId=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmPassword=By.id("input-confirm");
		By terms=By.xpath("//input[@name='agree']");
		By continueBtn=By.xpath("//input[@value='Continue']");
		By confMsg=By.xpath("//div[@id='content']/h1");
		
		doActionSendKeys(fName, "Dhanashri");
		doActionSendKeys(lName, "Asutkar");
		doActionSendKeys(emailId, "dhanashri3@gmail.com");
		doActionSendKeys(telephone, "2324234");
		doActionSendKeys(password, "dsa321");
		doActionSendKeys(confirmPassword, "dsa321");
		doActionClick(terms);
		doActionClick(continueBtn);
		if(doIsDisplayed(confMsg)) {
			System.out.println("Registration Succesful");
		}
		else {
			System.out.println("Registration failed");
		}
		//doIsDisplayed(confMsg);
		
		
		
		
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
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
