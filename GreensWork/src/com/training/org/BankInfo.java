package com.training.org;
// Override
public class BankInfo {

	public void saving() {
		System.out.println("Saving Acc");
	}
	
	public void fixed() {
		System.out.println("Fixed Acc");
	}
	
	public void deposit(int charges) {
		System.out.println("Deposit Acc "+charges);
	}
	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		bi.saving();
		bi.fixed();
		bi.deposit(5);
	}
}
