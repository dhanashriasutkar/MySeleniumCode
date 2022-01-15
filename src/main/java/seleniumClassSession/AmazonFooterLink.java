package seleniumClassSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonFooterLink {

	public static void main(String[] args) {
		String browser="chrome";
		
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://www.amazon.in/");
		ElementUtil eleUtil=new ElementUtil(driver) ;
		//Footer Link1
//		By footerLink=By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']//a");
//		eleUtil.clickOnElement(footerLink, "Sell on Amazon");
		
		//Footer Link2
//		By footerLink=By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine'][2]//a");
//		eleUtil.clickOnElement(footerLink, "United Kingdom");
		
		By foolterLink=By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']//a");
		List<String> text=eleUtil.getLinkTextList(foolterLink);
		
	}

}
