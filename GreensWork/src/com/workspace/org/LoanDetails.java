package com.workspace.org;

// Abstract Child class
public class LoanDetails extends Loan{

	@Override
	public void personalLoan() {
		System.out.println("per loan is 15%");
	}
	public static void main(String[] args) {
		LoanDetails ld = new LoanDetails();
		ld.bikeLoan();
		ld.carLoan();
		ld.personalLoan();
	}
	}
