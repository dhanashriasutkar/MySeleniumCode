package testNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS-----DBConnection");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT------createUser");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC------launchBrowser");
	}
	@BeforeMethod
	public void login() {
		System.out.println("BM------login");
	}
	@Test
	public void HomepageTest(){
		System.out.println("HomepageTest");
	}
	@Test
	public void AddtoCartPageTest(){
		System.out.println("AddtoCartPageTest");
	}
	@Test
	public void payementPageTest(){
		System.out.println("payementPageTest");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM--------logout");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--------closeBrowser");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT--------deleteUser");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS--------disconnectDB");
	}
}
