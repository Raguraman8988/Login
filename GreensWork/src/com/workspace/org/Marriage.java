package com.workspace.org;

// Method Overriding Sub class
public class Marriage extends Boy {
	@Override
	public void girlName() {
		super.girlName(); // method from Boy class
		System.out.println("Saashini");
	}

	public static void main(Strn[] args) {
		Marriage m = new Marriage();
		// Marriage bo = new Boy(); // Downcasting (Not Possible)
		m.girlName();
	}
}
