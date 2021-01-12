package com.practice.org;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i;
		for (i = 2; i < 100; i++) {
			boolean c=true;
			for (int j = 2; j < i; j++) {
				
				if (i%j==0) {
					c=false;
				}
				
			}
			if (c==true) {
				System.out.println("Given Number "+i+" is Prime Number");
			}
		/*	else {
				System.out.println("Given Number "+i+" is Not Prime Number");
			} */
		}

	}

}
