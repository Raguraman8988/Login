package com.training.org;

public class TypeCasting {
	
	// Automatically type casted
	public void wideningCasting() { 
		int i = 10;
		long l = i;
		float f = l;
		double d = l;
	//	char c= f;		//	Type Mismatch
		System.out.println("wideningCasting");
		System.out.println("int i "+i);
		System.out.println("long l "+l);
		System.out.println("float f "+f);
		System.out.println("double d "+d);
		System.out.println();
	}
	
	
	
	// Manually type cast
	public void narrowingCasting() {
		double d = 5;
		float f = 10;
		int i = (int) d;	// manual type casting
		long l = (long) f;  // manual type casting
		System.out.println("narrowingCasting");
		System.out.println("double d "+d);
		System.out.println("float f "+f);
		System.out.println("int i "+i);
		System.out.println("long l "+l);
	}
	
	public static void main(String[] args) {
		TypeCasting tc = new TypeCasting();
		tc.wideningCasting();
		tc.narrowingCasting();
	}
}
