package com.workspace.org;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[5];

		System.out.println("Defauit int a[0] value " + a[0]);

		System.out.println("Defauit int a[4] value " + a[4]);
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[4] = 70;

		int length = a.length;
		System.out.println("length " + length);

		System.out.println("a[0] " + a[0]);

		System.out.println("a[4] " + a[4]);

		// Overwritten a[4]
		System.out.println("Overwritten a[4] " + a[4]);
		
		System.out.println("For Loop ++");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
		System.out.println("For Loop --");
		
		for (int i = a.length-1; i >= 0 ; i--) {
			
			System.out.println(a[i]);
			
		}
		
		System.out.println("Foreach");
		
		for (int i : a) {
			
			System.out.println(i);
		}
		
		System.out.println("End");

	}

}
