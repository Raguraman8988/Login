package com.training.org;

public class ConstDemo {

	public ConstDemo() {
		System.out.println("In default ConstructorDemo");
	}

	public ConstDemo(String str) {
		System.out.println("City " + str);
	}

	public static void main(String[] args) {
	//	ConstDemo cd = new ConstDemo();
		ConstDemo cd = new ConstDemo("trichy");
	}
}
