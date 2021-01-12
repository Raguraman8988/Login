package com.workspace.org;

// using this keyword
public class Student {
	public Student() {
		this(100);
		System.out.println("I am a default constructor");

	}

	public Student(int id) {
		this("Arun");
		System.out.println("Student id is " + id);
	}

	public Student(String name) {
		System.out.println("Student name is " + name);
	}

	public static void main(String[] args) {

		Student s = new Student();
	}

}
