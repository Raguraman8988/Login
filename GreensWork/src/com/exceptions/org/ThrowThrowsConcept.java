package com.exceptions.org;

public class ThrowThrowsConcept {
	
	public static void checkEquals() throws Exception {
		
		int i=0, j=10;
		
		if (i==0) {
			System.out.println(j/i);
			throw new Exception();
			
		}
		else {
			System.out.println(i/j);
			System.out.println("task completed");

		}
		
	}
	public static void main(String[] args) throws Exception  {
		checkEquals();
	}
}
