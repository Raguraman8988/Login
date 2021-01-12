package com.workspace.org;

// Method Overriding Super Class
public class Boy {
	public void girlName() {
		System.out.println("Jananya");
	}

	public static void main(Strn[] args) {
		Boy bo = new Boy(); 
		//Boy bo = new Marriage(); //Upcasting: Child class object (Marriage) assigned in parent class
		bo.girlName();
	}
}
