package testNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Errors;

public class AmazonTest extends BaseTest {

	@Test(priority = 1)
	public void pageTitleTest() {
		
		String title = driver.getTitle();
		System.out.println("Page Title is:" + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.",Errors.TITLE_MISMATCHED_MSG);
	}

	@Test(priority = 2,enabled = true)
	public void PageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url :" + url);
		Assert.assertTrue(url.contains("amazon11"),Errors.URL_MISMATCHED_MSG);
	}

	@Test(priority = 3)
	public void searchBoxTest() {
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
	}

}
