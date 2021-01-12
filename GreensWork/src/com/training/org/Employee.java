package com.training.org;
//Single Parameter Overloading
public class Employee {
	public void empId(int id) {
		System.out.println("EmpId is "+id);
	}
	
	public void empId(String name) {
		System.out.println("Emp Name is "+name);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId(100);
		emp.empId("raj");
	}
}
