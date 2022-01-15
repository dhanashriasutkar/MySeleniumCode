package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreshworksTest {

	public static void main(String[] args) {
		
		String browser="chrome";
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.launchBrowser(browser);
		br.launchUrl("https://www.freshworks.com/");
		
		
		System.out.println(br.getCureentpageURL());
		System.out.println(br.getPageTitle());
		
		ElementUtil el=new ElementUtil(driver);
		
		By header=By.tagName("h2");
		
//		String text=driver.findElement(header).getText();
//		System.out.println(text);
//		
		System.out.println(el.doGetText(header));
		
		

	}

}
