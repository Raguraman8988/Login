package com.testngwork.org;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test
	private void add() {
		int i=10;
		int j=20;
		System.out.println("Value of i + j : "+(i+j));	
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() {
		int i=10;
		int j=0;
		System.out.println("value of i/j: "+(i/j));
	}
	
	@Test
	private void divide1() {
		int i=10;
		int j=0;
		System.out.println("value of i/j: "+(i/j));
	}
}
