package com.training.org;
// Diff datatype order in arguments
public class Phone {
	public void phoneInfo(String model) {
		System.out.println("Model "+model);
	}
	
	public void phoneInfo(String os, int price) {
		System.out.println("OS "+os+" "+"Price"+price);
	}
	
	public void phoneInfo(String color, int year, String make ) {
		System.out.println("Color "+color+" "+"Year "+year+" "+"Make "+make);
	}
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.phoneInfo("Black", 2019, "India");
		ph.phoneInfo("Android", 15000);
		ph.phoneInfo("Moto");
	}
}
