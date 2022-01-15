package seleniumClassSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Page Title is "+title);
		
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		driver.close();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());//No Such Session Exception
	}

}
