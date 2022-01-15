package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//1st Approach
//		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Dhanashri");
//		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Asutkar");
		
		//2nd Approach
//		WebElement fn=driver.findElement(By.id("Form_submitForm_FirstName"));
//		WebElement ln=driver.findElement(By.id("Form_submitForm_LastName"));
//		fn.sendKeys("Dhanashri");
//		ln.sendKeys("Asutkar");
		
		//3rd Approach
//		By fn=By.id("Form_submitForm_FirstName");
//		By ln=By.id("Form_submitForm_LastName");
//		
//		WebElement fnele=driver.findElement(fn);
//		WebElement lnele=driver.findElement(ln);
//		
//		fnele.sendKeys("Dhanashri");
//		lnele.sendKeys("Asutkar");
		
		//4th Approach
//		By fn=By.id("Form_submitForm_FirstName");
//		By ln=By.id("Form_submitForm_LastName");
//		getElement(fn).sendKeys("Dhanashri");
//		getElement(ln).sendKeys("Asutkar");
//		
//		//5th Approach
//		By fn=By.id("Form_submitForm_FirstName");
//		By ln=By.id("Form_submitForm_LastName");
//		doSendkeys(fn, "DHanashri");
//		doSendkeys(ln, "Asutkar");
		
		//6th Approach-create generic Utility
		
		By fn=By.id("Form_submitForm_FirstName");
		By ln=By.id("Form_submitForm_LastName");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendkeys(fn, "Dhanashri");
		eleUtil.doSendkeys(ln, "Asutkar");
		
}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static void doSendkeys(By locator,String Value) {
//		getElement(locator).sendKeys(Value);
//	}

}
