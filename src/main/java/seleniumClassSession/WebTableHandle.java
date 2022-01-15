package seleniumClassSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/portugal-t20-tri-series-2021-1272979/portugal-vs-malta-6th-match-1273140/full-scorecard");

		// System.out.println(getWicketName("Bikram Arora (c)"));
		System.out.println(getWicketName("Zeeshan Khan"));
		System.out.println(getWicketName("Waseem Abbas"));

		System.out.println(getScoreList("Waseem Abbas"));
		
		System.out.println(getBowlingScore("Najjam Shahzad"));
	}

	public static String getWicketName(String name) {
		String wicketerName = "//a[text()='" + name + "']//parent::td//following-sibling::td[@class='text-left']";
		return driver.findElement(By.xpath(wicketerName)).getText();
	}

	public static List<String> getScoreList(String playerName) {

		String scoreXpath = "//table[@class='table batsman']//a[text()='"+playerName+"']//parent::td//following-sibling::td";
		List<WebElement> scoreList = driver.findElements(By.xpath(scoreXpath));

		List<String> scoreLsitvalue = new ArrayList<String>();
		for (int i = 1; i < scoreList.size(); i++) {
			String text = scoreList.get(i).getText();
			scoreLsitvalue.add(text);

		}
		return scoreLsitvalue;
	}
	
	public static List<String> getBowlingScore(String playerName) {
		String scoreXpath="//table[@class='table bowler']//a[text()='"+playerName+"']//parent::td//following-sibling::td";
		
		List<WebElement>scoreList=driver.findElements(By.xpath(scoreXpath));
		
		List<String> scoreListValue = new ArrayList<String>();
		for(int i=0;i<scoreList.size();i++) {
			
			String text=scoreList.get(i).getText();
			scoreListValue.add(text);
		}
		
		return scoreListValue;
	}

}
