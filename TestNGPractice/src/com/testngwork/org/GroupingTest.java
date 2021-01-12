package com.testngwork.org;

import org.testng.annotations.Test;

public class GroupingTest {
	@Test(groups="Company")
	private void empName() {
		System.out.println("Emp name");
	}
	
	@Test(groups="Personal")
	private void address() {
		System.out.println("Address");
	}
	
	@Test(groups="Bank")
	private void accNumber() {
		System.out.println("Account Number");
	}
	
	@Test(groups="Bank")
	private void ifscCode() {
		System.out.println("ifsc code");
	}
	
	@Test(groups="Personal")
	private void contactNumber() {
		System.out.println("contact number");
	}

}
