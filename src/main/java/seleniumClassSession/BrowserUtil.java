package seleniumClassSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	public WebDriver driver;
	
	/******************************Launch Browser*********************/
	public WebDriver launchBrowser(String browserName) {
		if(browserName.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "D:\\My Selenium Study\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Study\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("safari")) {
			driver=new SafariDriver();
		}
		else {
			System.out.println("Pass Correct Browser");
		}
		return driver;
	}
	/******************************Launch URL*********************/
	public void launchUrl(String url) {
		if(url==null) {
			return;
		}
		if(url.isEmpty()) {
			return;
		}
		driver.get(url);
	}
	
	public String  getCureentpageURL() {
		return driver.getCurrentUrl();
	}
	
	/******************************Get Page Title*********************/
	public String getPageTitle() {
		
		return driver.getTitle();
	}
	
	/******************************Get Page Source*********************/
	public String getCurrentPageSource() {
		return driver.getPageSource();
	}
	
	/******************************Quit and Close Browser*********************/
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
}