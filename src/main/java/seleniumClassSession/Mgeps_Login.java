package seleniumClassSession;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mgeps_Login {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demonpcil.etenders.in/");
		driver.manage().window().maximize();
		By username=By.id("temp_username");
		By password=By.id("temp_password");
		By login=By.id("loginsubmit");
		By popup=By.xpath("//*[@id=\"myModal\"]/div/span");
		By cert_Login=By.id("btn_select_certificates");
		ElementUtil el=new ElementUtil(driver);
		el.doClick(popup);
		el.getElement(username).sendKeys("user_tp");
		el.getElement(password).sendKeys("Dsa@1234");
		el.doClick(login);
		el.doClick(cert_Login);
		Runtime.getRuntime().exec("D:\\Certificateselection.exe");
		

	}

}
