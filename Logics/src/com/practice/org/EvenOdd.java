package com.practice.org;

public class EvenOdd {

	public static void evenNum() {
		int sum = 0, count = 0;
		for (int i = 0; i < 30; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
				sum = sum + i;
				count = count + 1;
			}
		}
		System.out.println("Sum of Even NUmber is = " + sum);
		System.out.println("Count of Even NUmber is = " + count);
		System.out.println("**********************************");
	}

	public static void oddNum() {
		System.out.println();
		int sum = 0, count = 0;
		for (int i = 0; i < 30; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " ");
				sum = sum + i;
				count = count + 1;
			}
		}
		System.out.println("Sum of Odd NUmber is = " + sum);
		System.out.println("Count of Odd NUmber is = " + count);
	}

	public static void main(String[] args) {
		evenNum();
		oddNum();
	}
}
