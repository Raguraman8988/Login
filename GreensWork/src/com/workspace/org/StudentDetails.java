package com.workspace.org;

// Method Overloading 
public class StudentDetails {
	public void std() {
	}
	
	public void std(int id) {
		System.out.println("Student Id is: " + id);
	}

	public void std(String name, char initial) {
		System.out.println("Student Name with Initial: " + name + " " + initial);
	}

	public void std(String name, int marks) {
		System.out.println("Marks: " + name + " " + marks);
	}

	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.std(123);
		sd.std("Arun", 'B');
		sd.std("Arun", 67);
	}
}
