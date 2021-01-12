package com.training.org;

public class AxisBank extends BankInfo {
	@Override
	public void deposit(int charges) {
		super.deposit(charges);
	}
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit(10);
	}

}
