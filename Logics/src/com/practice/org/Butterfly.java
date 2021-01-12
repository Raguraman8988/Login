package com.practice.org;

public class Butterfly {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int len = a.length / 2;
		
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]);
		}
		for (int i = a.length-1; i >= len; i--) {
			System.out.println(a[i]);
		}
	}

}
