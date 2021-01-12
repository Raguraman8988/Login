package com.training.org;
// Diff no.of arguments
public class CompanyInfo {
	public void companyName(String compName) {
		System.out.println("Company Name "+compName);
	}
	
	public void companyName(String compName, String city) {
		System.out.println("Company Name "+compName+" "+"City "+city);
	}

	public void companyName(String domain, int years) {
		System.out.println("Domain "+domain+" "+"Years "+years);
	}
	public static void main(String[] args) {
		CompanyInfo ci = new CompanyInfo();
		ci.companyName("Greens Tech");
		ci.companyName("Greens", "Chennai");
		ci.companyName("Selenium Testing", 10);
	}
}
