package com.testngtraining.org;

import org.testng.annotations.Test;

public class amazonSearch {
	@Test(groups="men")
	private void mobileSearch() {
		System.out.println("Mobile Search");
	}
	
	@Test(groups="men")
	private void laptopSearch() {
		System.out.println("Laptop Search");
	}
	
	@Test(groups="kids")
	private void keychainSearch() {
		System.out.println("keychain Search");
	}
	
	@Test(groups="kids")
	private void toysSearch() {
		System.out.println("Toys Search");
	}
}
