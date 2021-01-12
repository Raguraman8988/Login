package com.practice.org;

public class PalindromeNumber {

	public static void checkPalindrome() {
		int a, i = 0, j = 0;
		int num = 151;
		a = num;
		while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
		}
		if (num == j) {
			System.out.println("Given Number is Palindrome");
		} else {
			System.out.println("Given Number is Not Palindrome");
		}
	}

	public static void printPalindrome() {
		int c = 0;
		System.out.println("Palindrome Number from 1 to 30");
		for (int n = 1; n < 100; n++) {
			int a, i = 0, j = 0;
			a = n;
			while (a > 0) {
				i = a % 10;
				j = (j * 10) + i;
				a = a / 10;
			}
			if (n == j) {
				System.out.println(j);
				c++;
			}
		}
		System.out.println("Count of palindrome Numbers = " + c);
	}

	public static void main(String[] args) {
		checkPalindrome();
		printPalindrome();
	}
}
