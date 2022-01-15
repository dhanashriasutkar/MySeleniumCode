package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
//		List<WebElement>choicelist=driver.findElements(By.cssSelector(".comboTreeItemTitle"));
//		for(WebElement e : choicelist) {
//			String text=e.getText();
//			if(text.equals("choice 2 3")) {
//				e.click();
//				break;
//			}
//		}
		By ddChoice=By.cssSelector(".comboTreeItemTitle");
		//Single selection
		//selectChoice(ddChoice, "choice 2 3");
		//Multiple Selection 
		//selectChoice(ddChoice, "choice 2","choice 2 2","choice 2 3");
		//Select ALL Choices
		selectChoice(ddChoice, "all");
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void selectChoice(By locator,String... value) {
		List<WebElement> choicelist=getElements(locator);
		if(!value[0].equalsIgnoreCase("all")) {
		for(WebElement e : choicelist)
		{
			String text=e.getText();
			for(int j=0;j<value.length;j++) {
				if(text.equals(value[j])){
					e.click();
					break;
				}
			}
				
		}
		}
		else {
			try {
			for(WebElement e : choicelist) {
				e.click();
			}
			}
			catch(Exception e){
				
			}
		}
	}

}
