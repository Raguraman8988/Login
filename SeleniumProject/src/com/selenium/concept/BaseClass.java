package com.selenium.concept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.ResourceService.WelcomeFactory;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		return driver;

	}

	public static void getUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	
	}

	// Both two are have doubt
	public static void takeScreenShot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destiFile = new File("D:\\Greens Workspace\\SeleniumProject\\ScreenShots\\" + fileName + ".png");
		FileUtils.copyFile(sourceFile, destiFile);
		// return fileName;
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
}
