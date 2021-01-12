package com.testngwork.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations {
	@BeforeSuite
	private void setup() {
		System.out.println("Setup");
	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void enterUrl() {
		System.out.println("Enter Url");
	}
	
	@BeforeMethod
	private void logIn() {
		System.out.println("Login");
	}
	
	@Test
	private void mobileSearch() {
		System.out.println("Mobile Search");
	}
	
	@Test
	private void laptopSearch() {
		System.out.println("Laptop Search");
	}
	
	@AfterMethod
	private void logOut() {
		System.out.println("Logout");
	}
	
	@AfterClass
	private void logVerfy() {
		System.out.println("Verify");
	}
	
	@AfterTest
	private void closeBrowser() {
		System.out.println("Browser Close");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Cookies Deleted");
	}
}
