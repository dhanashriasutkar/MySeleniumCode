package seleniumClassSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownOptionList {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		// By country=By.id("Form_submitForm_Country");

//		WebElement ind_ele=driver.findElement(industry);
//		//WebElement con_ele=driver.findElement(country);
//		Select select_inds=new Select(ind_ele);
//		List<WebElement> inds_list=select_inds.getOptions();
//		System.out.println(inds_list.size());
//		for(WebElement e : inds_list) {
//			String text=e.getText();
//			System.out.println(text);
		
		List<String> indList=getDropDownOptionsList(industry);
		if(indList.size()==21) {
			System.out.println("Test_001_Pass");
		}
		if(indList.contains("Healthcare")) {
			System.out.println("Test_002_Pass");
		}
		selectDropdownValue(industry, "Healthcare");
		
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<String> getDropDownOptionsList(By locator) {
		List<String> optionVallist=new ArrayList<String>();
		Select select=new Select(getElement(locator));
		List<WebElement> option_list=select.getOptions();
		System.out.println(option_list.size());
		for(WebElement e: option_list) {
			String text=e.getText();
			optionVallist.add(text);
			//System.out.println(text);
		}
		return optionVallist;

	}

	public static void selectDropdownValue(By locator, String value) {

		Select select = new Select(getElement(locator));
		List<WebElement> option_list = select.getOptions();
		for (WebElement e : option_list) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}
}
	
		
		
	
