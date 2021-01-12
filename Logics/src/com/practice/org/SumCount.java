package com.practice.org;

public class SumCount {
	public static void sumOfTwoNum() {
		int a = 4, b = 4;
		int c = a + b;
		System.out.println("Sum of a + b = " + c);
	}

	public static void sumOfGivenNum() {
		int a, i, j = 0, num = 12345;
		a = num;
		while (a > 0) {
			i = a % 10;
			j = j + i;
			a = a / 10;
		}
		System.out.println("Sum of given number is " + j);
	}

	public static void countOfGivenNumber() {
		int n, a, c = 0, num = 12345;
		a = num;
		while (a > 0) {
			a = a / 10;
			c++;
		}
		System.out.println("Count of given number is " + c);
	}

	public static void main(String[] args) {
		sumOfTwoNum();
		sumOfGivenNum();
		countOfGivenNumber();
	}
}
