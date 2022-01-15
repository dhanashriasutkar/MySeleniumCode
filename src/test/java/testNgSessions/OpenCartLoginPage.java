package testNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartLoginPage {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}
	
	@Test
	public void loginTest() {
		doLogin("dhanashri1@gmail.com", "dsa@1234");
	}
	@Test(dataProvider = "getLoginData")
	public void login_NegativeTest(String un,String pw) {
		Assert.assertTrue(doLogin(un,pw),"..........accepting incorrect credentials...........");
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] { {"dhanashri","dddddd"},
								{"   ","   "},
								{"dddddd","   "},
								{"   ","dsa@1234"},
			
							  };
	}
	
	
	public boolean doLogin(String un,String pw) {
		driver.findElement(By.id("input-email")).sendKeys(un);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pw);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		return driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).isDisplayed();
	}

	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}


}
