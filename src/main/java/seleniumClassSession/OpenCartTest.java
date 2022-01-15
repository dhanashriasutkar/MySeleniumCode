package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		
		String browser="chrome";
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.launchBrowser(browser);
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		//br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		System.out.println(br.getCureentpageURL());
		System.out.println(br.getPageTitle());
		
		ElementUtil el=new ElementUtil(driver);
		
		
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By email=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmPassword=By.id("input-confirm");
		By chbox=By.name("agree");
		//By login=By.linkText("Login");
		By forgotpass=By.partialLinkText("Forgotten");
		
		el.doSendkeys(firstName, "Dhanashri");
		el.doSendkeys(lastName, "Asutkar");
		el.doSendkeys(email, "dhanashri@gmail.com");
		el.doSendkeys(telephone, "98888883838");
		el.doSendkeys(password, "qwert@134");
		el.doSendkeys(confirmPassword, "qwert@134");
		
		//el.doClick(login);
		el.doClick(chbox);
		el.doClick(forgotpass);
		
		//br.closeBrowser();
		

	}

}
