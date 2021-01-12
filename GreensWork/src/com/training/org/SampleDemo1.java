package com.training.org;

public class SampleDemo1 extends SampleDemo2 {
	
	public void demo() {
		System.out.println("Super num old "+super.num);
		super.num=555;
		System.out.println("Super num new "+super.num);

	}
	
	public static void main(String[] args) {
		int number=456;
		String str ="Hi";
		SampleDemo1 sd = new SampleDemo1();
		
		System.out.println("num "+number);
		System.out.println("str "+str);
		sd.demo();
	}

}
