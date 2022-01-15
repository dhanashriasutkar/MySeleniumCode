package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLangLinks {

	public static void main(String[] args) {
		String browser="chrome";
		
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://www.google.co.in/");
		ElementUtil eleUtil=new ElementUtil(driver) ;
		
		By langLink=By.xpath("//div[@id='SIvCob']/a");
		eleUtil.clickOnElement(langLink, "मराठी");
//		List<WebElement> langcnt=eleUtil.getElements(langLink);
//		for(WebElement e : langcnt) {
//			String langtext=e.getText();
//			System.out.println(langtext);
//			if(langtext.equals("मराठी")) {
//				e.click();
//				break;
//			}
//		}
		
	}
	
	

}
