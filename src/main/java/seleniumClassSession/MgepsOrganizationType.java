package seleniumClassSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MgepsOrganizationType {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mgeps-uat-pune.etenders.in/Indexes/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("DIGITAL LOGIN")).click();
		By loginType=By.id("type");
		doSelectByVisibleText(loginType, "Merchant");
		By username=By.id("username");
		By password=By.id("password");
		By login=By.id("DigitalLogin");
		By menu=By.id("navbox-trigger");
		By submenu=By.xpath("//span[@class='title']");
		By subsubmenu=By.xpath("//div[@class='menu-name']");
		By org_Type=By.xpath("//button[text()='Select Organization Type']");
		
		//By org_type_Checkbox=By.xpath("//div[@class='modal-body']/p//input[@id='organization_type' and @value='Consultancy##1']");
		By org_type_Checkbox=By.xpath("//div[@class='modal-body']/p//input[@id='organization_type']");
		getElement(username).sendKeys("vendor-wl1");
		getElement(password).sendKeys("dsa@1234");
		doClick(login);
		doClick(menu);
		Thread.sleep(3000);
		clickonSubmenu(submenu, "Organization");
		Thread.sleep(5000);
		clickonSubmenu(subsubmenu, "Update Organization Profile");
		
		Thread.sleep(3000);
		
		doClick(org_Type);
		Thread.sleep(3000);
		//driver.findElement(org_type_Checkbox).click();
		selectCheckBox(org_type_Checkbox,"Services##8");
		
		
		

	}
	public static void clickonSubmenu(By locator,String value) {
		List<WebElement> subMenuList=getElements(locator);
		for(WebElement e : subMenuList) {
			String text=e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	public static void selectCheckBox(By locator,String value) {
		List<WebElement> checkboxlist=getElements(locator);
		for(WebElement e : checkboxlist ) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
				}
			}
		}
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectByVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
