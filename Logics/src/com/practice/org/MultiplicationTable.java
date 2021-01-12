package com.practice.org;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Multiplication Table");
		int a=s.nextInt();
		System.out.println("Till which number to multiple");
		int b=s.nextInt();
		int c;
		for (int i = 1; i <= b; i++) {
			c=a*i;
			System.out.println(a+" * "+i+" = "+c);
		}
	}
}
