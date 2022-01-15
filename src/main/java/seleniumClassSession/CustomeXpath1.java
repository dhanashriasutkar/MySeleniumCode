package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomeXpath1 {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");

		String username = "username";
		String password = "password";
		String loginbtn = "//input[@value='Login']";

		getElement("name", username).sendKeys("dhanashriasutkar");
		getElement("name", password).sendKeys("ashwini123");
		getElement("xpath", loginbtn).click();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public static By getBy(String locatorType, String locatorValue) {
		By locator = null ;

		switch (locatorType) {
		case "id":
			locator = By.id(locatorValue);
			break;

		case "name":
			locator = By.name(locatorValue);
			break;

		case "className":
			locator = By.className(locatorValue);
			break;

		case "linkText":
			locator = By.linkText(locatorValue);
			break;

		case "partialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;

		case "xpath":
			locator = By.xpath(locatorValue);
			break;

		case "cssSelector":
			locator = By.cssSelector(locatorValue);
			break;

		case "tagName":
			locator = By.tagName(locatorValue);
			break;
		default:

			System.out.println("Selector Type mismatch");
			break;
		}
		return locator;
	}

}
