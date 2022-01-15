package seleniumClassSession;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\My Selenium Study\\geckodriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
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
		//driver.quit();
	}

}

