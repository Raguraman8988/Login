package com.training.org;

public class ForLoopDemo {

	public void demo1() {

		int i = 5;
		System.out.println("******* demo1()*******");
		for (int j = 1; j <= i; j++) {
			for (int j2 = 1; j2 <= j; j2++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public void demo2() {
		System.out.println("******* demo2()*******");
		for (int j = 0; j <= 5; j++) {
			for (int i = 5; i > j; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void demo3() {
		System.out.println("******* demo3()*******");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("%");
			}
			System.out.println();
		}
	}

	public void demo4() {
		System.out.println();
		System.out.println("******* demo4()*******");
		for (int j = 1; j <= 3; j++) {
			for (int i = 3; i >= j; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void demo5() {
		System.out.println();
		System.out.println("******* demo5()*******");
		for (int j = 3; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void demo6() {
		System.out.println();
		System.out.println("******* demo6()*******");
		for (int j = 1; j <= 3; j++) {
			for (int i = 3; i >= j; i--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ForLoopDemo fd = new ForLoopDemo();
		fd.demo1();
		System.out.println();
		fd.demo2();
		System.out.println();
		fd.demo3();
		fd.demo4();
		fd.demo5();
		fd.demo6();
	}

}
