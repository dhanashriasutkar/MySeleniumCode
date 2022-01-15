import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumClassSession.ElementUtil;

public class CRMproAddUser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		
		ElementUtil el = new ElementUtil(driver);
		
		By username=By.name("username");
		By password=By.name("password");
		By loginbtn=By.xpath("//input[@value='Login']");
		
		el.doSendkeys(username, "dhanashriasutkar");
		el.doSendkeys(password, "ashwini123");
		el.doClick(loginbtn);
		Thread.sleep(2000);
		
		driver.switchTo().frame("mainpanel");
		
		By contacts=By.linkText("CONTACTS");
		By newContacts= By.linkText("New Contact");
		el.twoLevelMenuHandle(contacts, newContacts);
		
		By title=By.name("title");
		By fname=By.id("first_name");
		By mname=By.id("middle_initial");	
		By lname=By.id("surname");
		By suffix=By.name("suffix");
		By fileupload=By.id("image_file");
		By savebtn=By.xpath("//form[@id='contactForm']//input[@value='Save']");
				
				
		el.doSelectByVisibleText(title, "Miss");
		el.doSendkeys(fname, "Nikhil");
		el.doSendkeys(mname, "V");
		el.doSendkeys(lname, "wagh");
		el.doSelectByVisibleText(suffix, "MD");
		el.doSendkeys(fileupload, "D:\\Study\\113784722.jpg");
		el.doClick(savebtn);
		
		
		

	}

}
