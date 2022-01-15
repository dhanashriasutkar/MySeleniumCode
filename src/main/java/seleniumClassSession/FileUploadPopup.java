package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://spvharyana-test.etenders.in/banks/detail/spvharyana-test/Mg==/");
		driver.manage().window().maximize();
		By loginbtn=By.xpath("//*[@id=\"header_png\"]/a[1]");
		
		By username=By.id("username");
		By password=By.id("password");
		By login=By.id("loginsubmit");
		
		ElementUtil el=new ElementUtil(driver);
		el.doClick(loginbtn);
		Thread.sleep(2000);
		el.getElement(username).sendKeys("user_tp");
		el.getElement(password).sendKeys("dsa@1234");
		el.doClick(login);
		By mgt=By.xpath("//*[@id=\"hld\"]/div/div/div[1]/div[2]/div[2]/div[2]/div/div");
		By myBriefcase=By.xpath("//div[@id='sidebar_new']//a");
		By uploaddoc=By.cssSelector("#content > div > div.block_head > h2 > a");
		By docName=By.id("briefcasedoc_nm");
		By submit=By.id("upload_doc123");
		//------------------------------------------------
		el.doClick(mgt);
		el.clickOnElement(myBriefcase, "My Briefcase");
		el.doClick(uploaddoc);
		el.getElement(docName).sendKeys("Document1");
		driver.findElement(By.id("tender_docs")).sendKeys("C:\\Users\\Dhanashri\\Downloads\\certificate2.pdf");
		el.doClick(submit);
		driver.switchTo().alert().accept();

	}

}
