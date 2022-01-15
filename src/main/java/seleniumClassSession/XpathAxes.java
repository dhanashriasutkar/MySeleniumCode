package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");

		ElementUtil el = new ElementUtil(driver);

		By username = By.name("username");
		By password = By.name("password");
		By loginbtn = By.xpath("//input[@value='Login']");

		el.doSendkeys(username, "dhanashriasutkar");
		el.doSendkeys(password, "ashwini123");
		el.doClick(loginbtn);
		Thread.sleep(2000);

		driver.switchTo().frame("mainpanel");

		By contacts = By.linkText("CONTACTS");
		el.doClick(contacts);

		selectContact("Nayna Thakare");
		selectContact("Nikhil wagh");
		String Company = getCompany("meghsham wadaskar");

		System.out.println(Company);
		getDeatils("meghsham wadaskar");
	}

	public static void selectContact(String name) {
		By selectCheckbox = By
				.xpath("//a[text()='" + name + "']//parent::td//preceding-sibling::td/input[@type='checkbox']");
		driver.findElement(selectCheckbox).click();
	}

	public static String getCompany(String companyName) {
		By getCompanyName = By
				.xpath("//a[text()='" + companyName + "']//parent::td//following-sibling::td/a[@context='company']");
		return driver.findElement(getCompanyName).getText();
	}

	public static void getDeatils(String name) {
		By companyDeatils = By.xpath("//a[text()='" + name + "']//parent::td//following-sibling::td");
		List<WebElement> optionlist = driver.findElements(companyDeatils);
		int count=0;
		for (WebElement e : optionlist) {
			//String details = e.getText();
			if(count==5) {
				break;
			}
			System.out.println(e.getText());
			count++;
			}
		}
	}

