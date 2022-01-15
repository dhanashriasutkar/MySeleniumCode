package seleniumClassSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	static WebDriver driver;

	public static void main(String[] args) {
		String browser="chrome";
		
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\My Selenium Study\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Study\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("safari")) {
			driver=new SafariDriver();
		}
		else {
			System.out.println("Pass Correct Browser");
		}
		//-----------------------------------------------------------
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
