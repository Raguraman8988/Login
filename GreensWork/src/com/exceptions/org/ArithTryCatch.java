package com.exceptions.org;

public class ArithTryCatch {
	
	public static void division() {
		int i=0, j=10;
		 
		 try {
			System.out.println(j/i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 System.out.println("Operation Completed");
	}
	
	public static void division1() {
		int i=0, j=10;
		 
		 try {
			System.out.println(j/i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 System.out.println("Operation1 Completed");
		
	}
	
	public static void main(String[] args) {
		 division();
		 division1();
	}

}
