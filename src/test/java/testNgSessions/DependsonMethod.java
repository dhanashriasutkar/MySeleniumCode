package testNgSessions;

import org.testng.annotations.Test;

public class DependsonMethod {
	
	@Test
	public void loginTest() {
		System.out.println("Login page");
		int i=9/2;
	}
	
	@Test(dependsOnMethods = "loginTest" ,priority = 2)
	public void homePageTest() {
		System.out.println("homePageTest");
	}
	
	@Test(dependsOnMethods = "loginTest" ,priority = 1)
	public void searchPageTest() {
		System.out.println("searchPageTest");
	}
	
	

}
