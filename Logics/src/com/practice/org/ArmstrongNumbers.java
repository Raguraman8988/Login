package com.practice.org;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void checkArmstrong() {

		int n, a, i = 0, j = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		n = input.nextInt();
		a = n;
		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}
		if (n == j) {
			System.out.println("Armstrong Numbers");
		} else {
			System.out.println("Not Armstrong Numbers");
		}
		System.out.println();
	}

	public static void countArmstrong() {
		int c = 0;
		for (int n = 1; n < 1000; n++) {
			int a, i, j = 0;
			a = n;
			while (a > 0) {
				i = a % 10;
				j = j + (i * i * i);
				a = a / 10;
			}
			if (j == n) {
				System.out.println("Armstrong Numbers is = " + j);
				c++;
			}
		}
		System.out.println();
		System.out.println("Count of Armstrong Numbers is = " + c);
	}

	public static void main(String[] args) {
		checkArmstrong();
		countArmstrong();
	}
}
