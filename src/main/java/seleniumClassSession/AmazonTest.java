package seleniumClassSession;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.launchBrowser("chrome");
		
		br.launchUrl("https://www.amazon.in");
		String title=br.getPageTitle();
		if(title.contains("Online")) {
			System.out.println("Write URL");
		}
		else
		{
			System.out.println("wrong URL");
		}
		String url=br.getCureentpageURL();
		
		System.out.println(url);
				

	}

}
