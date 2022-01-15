package testNgSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffMailTest extends BaseTest{
	
	@Test(priority = 1)
	public void pageTitleTest() {
		
		String title = driver.getTitle();
		System.out.println("Page Title is:" + title);
		Assert.assertEquals(title, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
	}

	@Test(priority = 2)
	public void PageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url :" + url);
		Assert.assertTrue(url.contains("rediff"));
	}

}


