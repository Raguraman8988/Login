package com.students.names;

public class A extends B {
	
	int i=10;
	
	public void test1() {
		int i=100;
		System.out.println("Value of Local variable "+i);
		System.out.println("Value of Class Variable "+ this.i);
		System.out.println("Value of Class Variable "+ super.i);
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.test1();
		
	}
	
}
