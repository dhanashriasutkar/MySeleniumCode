package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {
   static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		By ddValue=By.cssSelector(".comboTreeItemTitle");
		//selectChoiceList(ddValue,"choice 2","choice 2 2","choice 2 3");
		selectChoiceList(ddValue,"all");

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void selectChoiceList(By locator,String... value ) {
		List<WebElement> choiceList=getElements(locator);
		
		if(!value[0].equalsIgnoreCase("all")) {
		for(WebElement e : choiceList) {
			String text=e.getText();
			for(int i=0;i<value.length;i++)
			if(text.equals(value[i])) {
				e.click();
				break;
			}
		}
	}
		else {
			try {
				for(WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {
				
			}
			
		}
}
	
}