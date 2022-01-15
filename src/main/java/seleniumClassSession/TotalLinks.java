package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		
//		System.out.println(links.size());
//		for(int i=0;i<links.size();i++) {
//			String linktext=links.get(i).getText();
//			if(!linktext.isEmpty()) {
//			System.out.println(i+""+linktext);
//			}
//		}
		
String browser="chrome";
		
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://www.amazon.in/");
		System.out.println(brUtil.getCureentpageURL());
		System.out.println(brUtil.getPageTitle());
		
		ElementUtil eleUtil=new ElementUtil(driver) ;
		//Total Links  In amazon-webscrapping
		By totalLinks=By.tagName("a");
		eleUtil.clickOnElement(totalLinks, "Best Sellers");
//		List<WebElement> links=eleUtil.getElements(totalLinks);
//		System.out.println(links.size());
//		int Counter=0;
//		for(WebElement e : links) {
//			
//			String Linktext=e.getText();
//			Counter++;
//			if(!Linktext.isEmpty()) {
//			System.out.println(Counter+"--->"+Linktext);
//			}
//		}
		
		
		//Total Image on Page in Amazon-webscrapping
//		By totalimg=By.tagName("img");
//		List<WebElement> imageList=eleUtil.getElements(totalimg);
//		System.out.println(imageList.size());
//		
//		for (int i=0;i<imageList.size();i++) {
//			String altValue=imageList.get(i).getAttribute("alt");
//			
//			String srcValue=imageList.get(i).getAttribute("src");
//			System.out.println(i+"-->"+altValue+"-->"+srcValue);
//		}

	}

}
