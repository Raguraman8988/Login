package com.training.org;

public class LoopDemo {
	
	public void inc() {
		
		int i=10;
		for (int j = 0; j < i; j++) {
			System.out.println(j);
			
		}
		
		System.out.println("next");
		
		for (int j = 10; j >=1 ; j--) {
			System.out.println(j);
			
		}
		
	}

public static void main(String[] args) {
	
	LoopDemo lp = new LoopDemo();
	lp.inc();
		
	}
}

