package com.training.org;
// Constructor using this Operator
public class ConstThisDemo {
	public ConstThisDemo() {
		this("Trichy");
		System.out.println("Im default Constructor");
	}
	
	public ConstThisDemo(String str) {
		this(45);
		System.out.println("Welcome");

		System.out.println("Hi Im "+str);
	}
	
	public ConstThisDemo(int num) {
		System.out.println("My Reg Num "+num);
		System.out.println("Thank U");
	}
	
	public static void main(String[] args) {
		ConstThisDemo cd = new ConstThisDemo();
	}
}
