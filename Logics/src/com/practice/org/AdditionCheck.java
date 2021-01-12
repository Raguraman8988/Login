package com.practice.org;

public class AdditionCheck {

	public static void main(String[] args) {
		int a[]= {4,5,7,11,9,13,8,12};
		int c[]= {};
		int n;
		
		for (int j = 0; j < a.length; j++) {
			for (int i = j+1; i <a.length ; i++) {
				
				if (a[i]+a[j]==20) {
					a[i]=a[i]+a[j];
					System.out.println(a[i]+" + "+a[j]+" = "+a[i]);
					
				}
			}
		}

	}

}
