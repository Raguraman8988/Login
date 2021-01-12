package com.training.org;

public class ClaA extends ClaB implements InterA {
	public void sampA() {
		System.out.println("Samp A from DemoClassA");
	}

	public static void main(String[] args) {
		ClaA a = new ClaA();
		a.sampA();
	}

	@Override
	public void demoX() {
	}

	@Override
	public void demoJ() {
	}

	@Override
	public void demoA() {
	}

	@Override
	public void demoB() {
	}

	
	
}
