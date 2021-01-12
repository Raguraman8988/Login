package com.practice.org;

public class AscendingDescending { 
	
	public static void ascendingOrder() {
		System.out.println("Ascending Order");
		int temp;
		int a[]= {40, 100, 200, 20, 10};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		int smallNum = a[0];
		System.out.println("Smallest Number "+smallNum);
		int largNum=a[a.length-1];
		System.out.println("Largest Number "+largNum);
		int thirdLargest = a[2];
		System.out.println("third largest "+thirdLargest);
		System.out.println();
	}
	
	public static void decendingOrder() {
		System.out.println("Decending Order");
		int temp;
		int a[]= {40, 100, 200, 20, 10};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		ascendingOrder();
		decendingOrder();
	}
	

}
