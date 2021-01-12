package com.testngwork.org;

import org.testng.annotations.Test;

public class DepenndsOnGroup {
	@Test(dependsOnGroups="Bank")
	private void empSalary() {
		System.out.println("Emp Salary");
	}
	
	@Test(groups="Bank")
	private void accNumber() {
		System.out.println("Account Number");
	}
	
	@Test(groups="Bank")
	private void ifscCode() {
		System.out.println("ifsc code");
	}
}
