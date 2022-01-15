package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		WebElement sourceEle=driver.findElement(By.id("draggable"));
		WebElement targetEle=driver.findElement(By.id("droppable"));
		
		Actions act =new Actions(driver);
//		act
//		.clickAndHold(sourceEle)
//		.moveToElement(targetEle)
//		.release(targetEle)
//		.build()
//		.perform();
		act.dragAndDrop(sourceEle, targetEle).perform();

	}

}
