package com.selenium.concept;

import org.testng.annotations.Test;

public class bikeSearch {
	@Test(groups ="small")
	private void santro() {
		System.out.println("santro");
	}
	
	@Test(groups ="big")
	private void innova() {
		System.out.println("innova");
	}
	
	@Test(groups = "small")
	private void yamahaBike() {
		System.out.println("alto");
	}
	
	@Test(groups = "big")
	private void pulserBike() {
		System.out.println("bmw");
	}
}
