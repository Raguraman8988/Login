package com.automation.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG{
	
	@BeforeSuite
	private void setUp() {
		System.out.println("Setup");
	}
	
	@BeforeTest
	private void browserLanuch() {
		System.out.println("BrowserLaunch");
	}
	
	@BeforeClass
	private void enterAmazonUrl() {
		System.out.println("Entered Amazon URL");
	}
	
	@BeforeMethod
	private void loginAmazon() {
		System.out.println("Login Amazon");
	}
	
	@Test
	private void searchMobile() {
		System.out.println("Search Mobile");
	}
	
	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	private void verifyPage() {
		System.out.println("Verify");
	}
	
	@AfterTest
	private void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Cookies Deleted");
	}
}
