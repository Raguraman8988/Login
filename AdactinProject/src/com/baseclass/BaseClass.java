package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.ResourceService.WelcomeFactory;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Invalid browsername");
		}
		return driver;
	}

	public static void browserClose() {
		browserClose();
	}

	public static void driverQuit() {
		driver.quit();
	}

	public static void getPageClass() {
		driver.getClass();
	}

	public static void getPageTitle() {
		driver.getTitle();
	}

	public static void getUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void getCurrentPageUrl() {
		driver.getCurrentUrl();
	}

	public static void inputOnElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void dropDownElement(WebElement element, String option, String values) {
		Select s = new Select(element);
		try {
			if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(values));
			} else if (option.equalsIgnoreCase("value")) {
				s.selectByValue(values);
			} else if (option.equalsIgnoreCase("text")) {
				s.selectByVisibleText(values);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	// Both two are have doubt
	public static void takeScreenShot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destiFile = new File("D:\\Greens Workspace\\AdactinProject\\ScreenShot\\" + fileName + ".png");
		FileUtils.copyFile(sourceFile, destiFile);
	}

	public static void scrollDownUp(WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void enableElement(WebElement check) {
		boolean enabled = check.isEnabled();
		System.out.println(check + " isEnabled: " + enabled);
	}

	public static void isSlected(WebElement check) {
		boolean selected = check.isSelected();
		System.out.println(check + " isSelected: " + selected);
	}

	public static void isDisplayed(WebElement check) {
		boolean diselected = check.isDisplayed();
		System.out.println(check + " isSelected: " + diselected);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void refreshPage() {
		driver.navigate().refresh();
	}

	public static void contextClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	public static void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}

	public static void singleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	public static void keyPressDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void keyPressUp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void keyPressEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void alertBoxAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void alertBoxDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	private void alertSendenKeyAccept(WebElement alertBox, String msg) {
		Alert a = driver.switchTo().alert();
		alertBox.sendKeys(msg);
		a.accept();
	}

	public static void windowsHandles(String actualTitle) {
		Set<String> allId = driver.getWindowHandles();

		for (String id : allId) {
			String title = driver.switchTo().window(id).getTitle();
		}
		String title = actualTitle;
		for (String id : allId) {
			if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
				break;
			}
		}
	}

	public static void activeImplicitlyWait(int timeOutSeconds) {
		driver.manage().timeouts().implicitlyWait(timeOutSeconds, TimeUnit.SECONDS);
	}

	private void activeExplicitlyWait(int timeOutSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutSeconds);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public static void switchFrame(WebElement freameElement) {
		driver.switchTo().frame(freameElement);
	}

	public static void switchDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public static String getTextOnElement(WebElement getTextElement) {
		String getText = getTextElement.getText();
		return getText;
	}

	public static String getAttributeOnElementValue(WebElement getAttributeElement, String attributeName) {
		String attribute = getAttributeElement.getAttribute(attributeName);
		return attribute;
	}
	
	public static List<WebElement> getOptionsOnElement(WebElement element) {
		Select s= new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}
	
	public static void switchToParentFrameWindow() {
		driver.switchTo().parentFrame();
	}
	
	public static void clearOnElement(WebElement clearDlement) {
		clearDlement.clear();	
	}
}
