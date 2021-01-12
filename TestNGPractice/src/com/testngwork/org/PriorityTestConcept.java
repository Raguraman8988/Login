package com.testngwork.org;

import org.testng.annotations.Test;

public class PriorityTestConcept {
	@Test
	private void watchSearch() {
		System.out.println("Watch");
	}
	
	@Test(priority = 1)
	private void mobileSearch() {
		System.out.println("Mobile");
	}
	
	@Test(priority = 2)
	private void laptopSearch() {
		System.out.println("Laptop");
	}
	
	@Test
	private void toysSearch() {
		System.out.println("Toys");
	}
	
	@Test
	private void giftSearch() {
		System.out.println("Gift");
	}
	

	@Test(priority = 3)
	private void dressSearch() {
		System.out.println("Dress");
	}
}
