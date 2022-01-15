package seleniumClassSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserSwitchTest {
	static WebDriver driver;

	public static void main(String[] args) {
		String browser="chrome";
		switch (browser) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Study\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "firefox":	
			//System.setProperty("webdriver.gecko.driver", "D:\\My Selenium Study\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "safari":	
			driver=new SafariDriver();
			break;
		
		default:
			System.out.println("Passing wrong Browser");
			break;
		}
		
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Page Title is "+title);
		if(title.equals("Google")) {
			System.out.println("Page title is Correct");
		}
		else {
			System.out.println("Page title is InCorrect");
		}
		System.out.println(driver.getCurrentUrl());

	}

}
