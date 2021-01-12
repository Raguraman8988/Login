package com.selenium.concept;

import org.openqa.selenium.WebDriver;

public class XpathFinder {
	public static WebDriver driver;
	public static void xpathSearch() {
		driver = BaseClass.browserLaunch();
		BaseClass.getUrl("http://www.adactin.com/HotelApp/");
	}

	public static void main(String[] args) {
		xpathSearch();
	}

}
