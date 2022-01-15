package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetAttributeConcept {

	public static void main(String[] args) {
		String browser="chrome";
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.launchBrowser(browser);
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		
		ElementUtil el=new ElementUtil(driver);
		By login=By.linkText("Login");
		String hrefval=el.doGetAttribute(login, "href");
		System.out.println(hrefval);
		
		By fn=By.id("input-firstname");
		System.out.println(el.doGetAttribute(fn, "placeholder"));

		//		String hrefval=driver.findElement(login).getAttribute("href");
//		System.out.println(hrefval);

	}
	
	

}
