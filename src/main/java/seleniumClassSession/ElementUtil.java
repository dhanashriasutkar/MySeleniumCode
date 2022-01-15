package seleniumClassSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendkeys(By locator, String Value) {
		getElement(locator).sendKeys(Value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public By getBy(String locatorType, String locatorValue) {
		By locator = null;

		switch (locatorType) {
		case "id":
			locator = By.id(locatorValue);
			break;

		case "name":
			locator = By.name(locatorValue);
			break;

		case "className":
			locator = By.className(locatorValue);
			break;

		case "linkText":
			locator = By.linkText(locatorValue);
			break;

		case "partialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;

		case "xpath":
			locator = By.xpath(locatorValue);
			break;

		case "cssSelector":
			locator = By.cssSelector(locatorValue);
			break;

		case "tagName":
			locator = By.tagName(locatorValue);
			break;
		default:

			System.out.println("Selector Type mismatch");
			break;
		}
		return locator;
	}

	public String doGetAttribute(By locator, String attrvalue) {
		return getElement(locator).getAttribute(attrvalue);
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}

	// Webscrapping Click on Element after Find Element
	public void clickOnElement(By locator, String value) {
		List<WebElement> eleList = getElements(locator);
		System.out.println(eleList.size());
		for (WebElement e : eleList) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

	// getting link text
	public List<String> getLinkTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		System.out.println("Total Link:" + eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;

	}

	// *********************************DropDown Utility for Select
	// Tag********************
	public void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	// *****************GetALLOption from Dropdown*******************
	public List<String> getDropDownOptionsList(By locator) {
		List<String> optionVallist = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> option_list = select.getOptions();
		System.out.println(option_list.size());
		for (WebElement e : option_list) {
			String text = e.getText();
			optionVallist.add(text);
			// System.out.println(text);
		}
		return optionVallist;

	}

	public void selectDropdownValue(By locator, String value) {

		Select select = new Select(getElement(locator));
		List<WebElement> option_list = select.getOptions();
		for (WebElement e : option_list) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}

	// ************************Click on Value without Select Option using
	// locator(Specially Dropdwon)*******************
	public void clickDrodownpValue(By locator, String value) {
		List<WebElement> option_list = getElements(locator);
		System.out.println(option_list.size());
		for (WebElement e : option_list) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}

		}
	}

	// *******************************User Action
	// ******************************************************
	public void twoLevelMenuHandle(By parentMenu, By childMenu) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		getElement(childMenu).click();

	}

	public void threelevelMenuhandle(By mainMenu, By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(mainMenu)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		getElement(childMenu).click();
		;
	}

	public void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}

	public void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

}
