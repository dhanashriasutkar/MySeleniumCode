package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementisDisplayed {

	public static void main(String[] args) {
		String browser="chrome";
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.launchBrowser(browser);
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
//		boolean flag=driver.findElement(By.name("firstname")).isDisplayed();
//		System.out.println(flag);
		ElementUtil el=new ElementUtil(driver);
		By fn=By.name("firstname");
		System.out.println(el.doIsDisplayed(fn));
		
		By searchfield=By.name("search");
		By seachbutton=By.xpath("//*[@id=\"search\"]/span/button");
		if(el.doIsDisplayed(searchfield)) {
			el.doSendkeys(searchfield, "Mackbook");
			el.doClick(seachbutton);
		}
	}
	
	

}
