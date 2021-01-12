package com.exceptions.org;

public class ArithFinally {
	
	public static void division() {
		
		int i=0, j=10;
		 
		 try {
			System.out.println(j/i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 finally {
			System.out.println("reached finally block");
		}
		 
		 System.out.println("Operation Completed");
	}
	
	public static void division1() {
		int i=10, j=2;
		 
		 try {
			System.out.println(i/j);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 finally {
			System.out.println("reached finally block1");
		}
		 
		 System.out.println("Operation Completed1");
		
	}
	
	public static void main(String[] args) {
		division();
		division1();
	}
}
