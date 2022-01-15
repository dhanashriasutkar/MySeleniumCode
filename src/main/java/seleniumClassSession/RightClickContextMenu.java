package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickContextMenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		//WebElement  = driver.findElement(By.xpath("//span[text()='right click me']"));
		By rightClick=By.xpath("//span[text()='right click me']");
		By rightClickMenu = By.cssSelector(".context-menu-item.context-menu-icon");
//		Actions act = new Actions(driver);
//		act.contextClick(rightClick).perform();

//		List<WebElement> menuList = driver.findElements(rightClickMenu);
//		System.out.println(menuList.size());
//		for (WebElement e : menuList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}
		rightClickMenuContext(rightClick,rightClickMenu, "Edit");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void rightClickMenuContext(By locator1, By locator2, String value) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator1)).perform();
		List<WebElement> menuList=getElements(locator2);
		for(WebElement e : menuList) {
			String text=e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}

	}

}
