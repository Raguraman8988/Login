package com.training.org;

public final class FinalDemo {
	final int roll = 111; 
	int numb = 123;
	public final void sampA() {
		System.out.println("Im final method");
		System.out.println("roll "+roll);
		System.out.println("num "+numb);
	}
	public void sampB() {
		System.out.println("Im methos B");
		System.out.println("2roll "+roll);
		System.out.println("2num "+numb);
	}
	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.sampA();
		fd.sampB();
	}
}
