package com.training.org;

public class AddDemo {
	
	public int demoAdd(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void main(String[] args) {
		AddDemo ad = new AddDemo();
		System.out.println(	ad.demoAdd(10, 20));
	}

}
