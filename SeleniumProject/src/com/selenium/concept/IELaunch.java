package com.selenium.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\Greens Workspace\\SeleniumProject\\Driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com");

	}

}
