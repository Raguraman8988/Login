package com.testngwork.org;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestConcept {
	
	@Test
	private void watchSearch() {
		System.out.println("Watch");
	}
	
	@Test
	private void mobileSearch() {
		System.out.println("Mobile");
	}
	@Ignore
	@Test
	private void laptopSearch() {
		System.out.println("Laptop");
	}
	
	@Test(enabled = false)
	private void toysSearch() {
		System.out.println("Toys");
	}
	
	@Test
	private void giftSearch() {
		System.out.println("Gift");
	}
	
	@Ignore
	@Test
	private void dressSearch() {
		System.out.println("Dress");
	}
}
