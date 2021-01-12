package com.workspace.org;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input");
		
		String nextLine = sc.nextLine();
		System.out.println("Entered value is "+nextLine);
		
		System.out.println("Enter 2nd value");
		String next1 = sc.next();
		System.out.println("2nd Input: "+next1);
		
	}

}
