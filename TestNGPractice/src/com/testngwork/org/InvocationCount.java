package com.testngwork.org;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 10)
	private void watchSearch() {
		System.out.println("Watch");
	}
	
	@Test
	private void mobileSearch() {
		System.out.println("Mobile");
	}
	
	@Test
	private void laptopSearch() {
		System.out.println("Laptop");
	}
	
	@Test(invocationCount = 5)
	private void toysSearch() {
		System.out.println("Toys");
	}
	
	@Test(invocationTimeOut = 5)
	private void giftSearch() {
		System.out.println("Gift");
	}
	
	@Test
	private void dressSearch() {
		System.out.println("Dress");
	}
}
