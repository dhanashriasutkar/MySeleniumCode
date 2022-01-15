package seleniumClassSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropdown1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By countryName=By.name("Country");
		//clickonDropdownOption(countryName);
		

	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static List<String> clickonDropdownOption(By locator) {
		List<String> optionValList=new ArrayList<String>();
		
		Select select=new Select(getElement(locator));
		List<WebElement> option_list=select.getOptions();
		System.out.println(option_list.size());
		
		for(WebElement e:option_list) {
			String text=e.getText();
			//System.out.println(text);
			optionValList.add(text);
		}
		return optionValList;
		
	}

}
