package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBaseDropdown {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry=By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");
		
//		WebElement ind_ele=driver.findElement(industry);
//		WebElement con_ele=driver.findElement(country);
//		
//		Select select=new Select(ind_ele);
//		//select.selectByIndex(5);
//		//select.selectByVisibleText("Education");
//		select.selectByValue("media");
//		
//		Select select_country=new Select(con_ele);
//		select_country.selectByIndex(8);
		doSelectByVisibleText(industry, "Education");
		doSelectByVisibleText(country, "India");
		
		
	}
	public  static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}

}
