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

public class OpenCartRegisterPage {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

	}
	
	@Test(dataProvider = "getRegisterData")
	public void registerNegativeTest(String fn,String ln,String email,String Telephone,String pwd) {
		Assert.assertTrue(doRegisterTest(fn,ln,email,Telephone,pwd), "Your Account Has Been Created!");
		
	}
	@DataProvider
	public Object[][] getRegisterData() {
		return new Object[][] {
			{"Dhanashri","Asutkar","dhanashri1@gmail.com","3121233","dsa@1234"},
			{"  ","   ","   ","  ","   "},
			{"DHanashri","   ","   ","  ","   "},
			{"  ","Asutkar","   ","  ","   "},
			{"  ","   ","dhanashri1@gmail.com","  ","   "},
			{"  ","   ","    ","1123123123","   "},
			{"  ","   ","    ","   ","dsa@1234"},
			{"  ","   ","    ","   ","    "},
		};
	}
	
	public boolean doRegisterTest(String fn,String ln,String email,String Telephone,String pwd) {
	driver.findElement(By.id("input-firstname")).sendKeys(fn);
	driver.findElement(By.id("input-firstname")).clear();
	driver.findElement(By.id("input-lastname")).sendKeys(ln);
	driver.findElement(By.id("input-lastname")).clear();
	driver.findElement(By.id("input-email")).sendKeys(email);
	driver.findElement(By.id("input-email")).clear();
	driver.findElement(By.id("input-telephone")).sendKeys(Telephone);
	driver.findElement(By.id("input-telephone")).clear();
	driver.findElement(By.id("input-password")).sendKeys(pwd);
	driver.findElement(By.id("input-password")).clear();
	driver.findElement(By.id("input-confirm")).sendKeys(pwd);
	driver.findElement(By.id("input-confirm")).clear();
	driver.findElement(By.name("agree")).click();
	
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	return driver.findElement(By.xpath("//div[@id='content']/h1")).isDisplayed();
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
