package testNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name="Testing";
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class} )
	public void homePageTest() {
		System.out.println("homePageTest");
		int i=9/0;
		ExpectedExceptionConcept obj=null;
		System.out.println(obj.name);
	}

}
