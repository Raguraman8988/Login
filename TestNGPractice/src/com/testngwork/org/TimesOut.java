package com.testngwork.org;

import org.testng.annotations.Test;

public class TimesOut {
	@Test
	private void mobileSearch() {
		System.out.println("Mobile");
	}
	
	@Test
	private void laptopSearch() {
		System.out.println("Laptop");
	}

	@Test(timeOut = 3000)
	private void dressSearch() throws Exception {
		Thread.sleep(5000);
		System.out.println("Dress");
	}
	
	@Test(invocationTimeOut = 3000)
	private void watchSearch() throws Exception {
	//	Thread.sleep(4000);
		System.out.println("Watch");
	}
}
