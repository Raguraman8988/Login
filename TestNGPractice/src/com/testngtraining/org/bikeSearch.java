package com.testngtraining.org;

import org.testng.annotations.Test;

public class bikeSearch {
	@Test(groups ="100cc")
	private void herohondaBike() {
		System.out.println("Herohonda");
	}
	
	@Test(groups ="100cc")
	private void bajajBike() {
		System.out.println("Bajaj");
	}
	
	@Test(groups = "150cc")
	private void yamahaBike() {
		System.out.println("Yamaha");
	}
	
	@Test(groups = "150cc")
	private void pulserBike() {
		System.out.println("Pluser");
	}
}
