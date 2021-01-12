package com.workspace.org;

public class Array {
	public static void main(String[] args) {
		int a[] = new int[5];
		
		System.out.println(a[2]);
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[4] = 70;
		
		//to get the value using index
		System.out.println(a[3]);
		
		//Index Overwriten
		System.out.println("new "+a[4]);
		
		
		//using length to get the value
		int length = a.length;
		System.out.println(length);
		
		//to get each value using for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
			
			
		}
		
		
		
		
	}
}
