package com.workspace.org;

// Sub/Child class Interface
public class LoanDetails2 implements Loan2  {

	@Override
	public void homeLoan() {
		System.out.println("Home Loan Available");
	}

	@Override
	public void carLoan() {
		System.out.println("Car Loan Available");
	}

	@Override
	public void bikeLoan() {
		System.out.println("Bike Loan Available");
	}
	public static void main(String[] args) {
		LoanDetails2 ld = new LoanDetails2();
		ld.bikeLoan();
		ld.carLoan();
		ld.homeLoan();
	}
}