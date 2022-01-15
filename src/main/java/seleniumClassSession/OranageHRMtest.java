package seleniumClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OranageHRMtest {
	
//7th Approach
	public static void main(String[] args) {
		String browser="chrome";
		
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(brUtil.getCureentpageURL());
		System.out.println(brUtil.getPageTitle());
		
		ElementUtil eleUtil=new ElementUtil(driver) ;
			By firstName=By.id("Form_submitForm_FirstName");
			By lastName=By.id("Form_submitForm_LastName");
			By email=By.id("Form_submitForm_Email");
			By jobTitle=By.id("Form_submitForm_JobTitle");
			By company=By.id("Form_submitForm_CompanyName");
			By phoneNumber=By.id("Form_submitForm_Contact");
			
		eleUtil.doSendkeys(firstName, "Dhanashri");
		eleUtil.doSendkeys(lastName, "Asutkar");
		eleUtil.doSendkeys(email, "Asutkar@gmail.com");
		eleUtil.doSendkeys(jobTitle, "ST");
		eleUtil.doSendkeys(company, "Nextender");
		eleUtil.doSendkeys(phoneNumber, "87697988789");
		
		//brUtil.closeBrowser();	
		

	}

}
