package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.ResourceService.WelcomeFactory;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"Driver\\geckodriver.exe");
				driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+"Driver\\IEDriverServer.exe");
				driver = new ChromeDriver();
		}else {
			System.out.println("Invalid browsername");
		}
		return driver;
	}

	public static void getUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	
	}
	
	public static void inputOnElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void dropDownElement(WebElement element, String option, String values) {
		Select s= new Select(element);
		try {
			if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(values));
			}else if (option.equalsIgnoreCase("value")) {
				s.selectByValue(values);
			}else if (option.equalsIgnoreCase("text")) {
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
		File destiFile = new File("D:\\Greens Workspace\\SeleniumProject\\ScreenShots\\" + fileName + ".png");
		FileUtils.copyFile(sourceFile, destiFile);
		// return fileName;
	}
	
	public static void scrollDown(int side, int down) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+side+","+down+")");
		Thread.sleep(2000);
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
	
	
}
