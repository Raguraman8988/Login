package com.training.org;

public class StaticDemo {
	public static void sampA() {
		System.out.println("Im static Methos");
	}

	public void sampB() {
		System.out.println("Im method sampB");
	}

	public static void main(String[] args) {
		sampA();
		StaticDemo sd = new StaticDemo();
		sd.sampB();
	}
}
