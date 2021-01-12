package com.testngwork.org;

import org.testng.annotations.Test;

public class GroupsOfGroups {
	
	@Test(groups="Selenium test")
	private void test1() {
		System.out.println("test1");
	}
	
	@Test(groups="Selenium test")
	private void test2() {
		System.out.println("test2");
	}
	
	@Test(groups="API test")
	private void test3() {
		System.out.println("test3");
	}
	
	@Test(groups="API test")
	private void test4() {
		System.out.println("test4");
	}
	
	@Test(groups="Manual test")
	private void test5() {
		System.out.println("test5");
	}
}
