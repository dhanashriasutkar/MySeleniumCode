package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownValueWithoutSelect {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.xpath("//select[@id='Form_submitForm_Industry']/option");
//		List<WebElement> indus_List=driver.findElements(industry);
//		System.out.println(indus_List.size());
//		
//		for(WebElement e:indus_List) {
//			String text=e.getText();
//			if(text.equals("Healthcare")) {
//				e.click();
//				break;
//			}
//		}
		clickDrodownpValue(industry, "Healthcare");

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void clickDrodownpValue(By locator,String value) {
		List<WebElement> option_list=getElements(locator);
		System.out.println(option_list.size());
		for(WebElement e:option_list) {
			String text=e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
				
			
		}
	}

}
