package com.testngwork.org;

import org.testng.annotations.Test;

public class DependencyTest {
	
	@Test
	private void login() {
		System.out.println("login");
	}
	
	@Test
	private void searchMobile() {
		System.out.println("Search Mobile");
	}
	
	@Test(dependsOnMethods="searchMobile")
	private void logout() {
		System.out.println("Logout");
	}
}
