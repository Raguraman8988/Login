package com.exceptions.org;

public class MyException extends Exception {

	public MyException() {
		System.out.println("Value can not be zero");
	}

	public MyException(String value) {
		System.out.println("check entered value once");
	}

}
