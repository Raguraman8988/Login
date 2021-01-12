package com.testngwork.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	private void facebookLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Workspace\\TestNGPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	private void amazonLaunch() {
		System.setProperty("webdriver.gecko.driver", "D:\\Greens Workspace\\TestNGPractice\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	private void googleLaunch() {
		System.setProperty("webdriver.ie.driver", "D:\\Greens Workspace\\TestNGPractice\\Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
	}

}
